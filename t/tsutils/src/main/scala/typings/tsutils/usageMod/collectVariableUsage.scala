package typings.tsutils.usageMod

import typings.std.Map
import typings.typescript.mod.Identifier
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", "collectVariableUsage")
@js.native
object collectVariableUsage extends js.Object {
  def apply(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
}

