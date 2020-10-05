package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedProjectReference extends js.Object {
  var commandLine: ParsedCommandLine = js.native
  var references: js.UndefOr[js.Array[js.UndefOr[ResolvedProjectReference]]] = js.native
  var sourceFile: SourceFile = js.native
}

object ResolvedProjectReference {
  @scala.inline
  def apply(commandLine: ParsedCommandLine, sourceFile: SourceFile): ResolvedProjectReference = {
    val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedProjectReference]
  }
  @scala.inline
  implicit class ResolvedProjectReferenceOps[Self <: ResolvedProjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandLine(value: ParsedCommandLine): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFile(value: SourceFile): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencesVarargs(value: js.UndefOr[ResolvedProjectReference]*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[js.UndefOr[ResolvedProjectReference]]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
  
}

