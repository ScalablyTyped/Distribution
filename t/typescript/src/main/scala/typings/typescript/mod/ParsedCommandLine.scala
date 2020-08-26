package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCommandLine extends js.Object {
  var compileOnSave: js.UndefOr[Boolean] = js.native
  var errors: js.Array[Diagnostic] = js.native
  var fileNames: js.Array[java.lang.String] = js.native
  var options: CompilerOptions = js.native
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  var raw: js.UndefOr[js.Any] = js.native
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.native
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  var wildcardDirectories: js.UndefOr[MapLike[WatchDirectoryFlags]] = js.native
}

object ParsedCommandLine {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], fileNames: js.Array[java.lang.String], options: CompilerOptions): ParsedCommandLine = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCommandLine]
  }
  @scala.inline
  implicit class ParsedCommandLineOps[Self <: ParsedCommandLine] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: Diagnostic*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Diagnostic]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileNamesVarargs(value: java.lang.String*): Self = this.set("fileNames", js.Array(value :_*))
    @scala.inline
    def setFileNames(value: js.Array[java.lang.String]): Self = this.set("fileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: CompilerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompileOnSave(value: Boolean): Self = this.set("compileOnSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompileOnSave: Self = this.set("compileOnSave", js.undefined)
    @scala.inline
    def setProjectReferencesVarargs(value: ProjectReference*): Self = this.set("projectReferences", js.Array(value :_*))
    @scala.inline
    def setProjectReferences(value: js.Array[ProjectReference]): Self = this.set("projectReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectReferences: Self = this.set("projectReferences", js.undefined)
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = this.set("typeAcquisition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAcquisition: Self = this.set("typeAcquisition", js.undefined)
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
    @scala.inline
    def setWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = this.set("wildcardDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWildcardDirectories: Self = this.set("wildcardDirectories", js.undefined)
  }
  
}

