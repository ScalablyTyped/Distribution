package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedProjectReference extends js.Object {
  var commandLine: ParsedCommandLine
  var references: js.UndefOr[js.Array[js.UndefOr[ResolvedProjectReference]]] = js.undefined
  var sourceFile: SourceFile
}

object ResolvedProjectReference {
  @scala.inline
  def apply(
    commandLine: ParsedCommandLine,
    sourceFile: SourceFile,
    references: js.Array[js.UndefOr[ResolvedProjectReference]] = null
  ): ResolvedProjectReference = {
    val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedProjectReference]
  }
}

