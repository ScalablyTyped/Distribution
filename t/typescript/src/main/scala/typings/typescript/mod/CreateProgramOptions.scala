package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProgramOptions extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  var host: js.UndefOr[CompilerHost] = js.native
  var oldProgram: js.UndefOr[Program] = js.native
  var options: CompilerOptions = js.native
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  var rootNames: js.Array[java.lang.String] = js.native
}

object CreateProgramOptions {
  @scala.inline
  def apply(options: CompilerOptions, rootNames: js.Array[java.lang.String]): CreateProgramOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgramOptions]
  }
  @scala.inline
  implicit class CreateProgramOptionsOps[Self <: CreateProgramOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: CompilerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootNamesVarargs(value: java.lang.String*): Self = this.set("rootNames", js.Array(value :_*))
    @scala.inline
    def setRootNames(value: js.Array[java.lang.String]): Self = this.set("rootNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigFileParsingDiagnosticsVarargs(value: Diagnostic*): Self = this.set("configFileParsingDiagnostics", js.Array(value :_*))
    @scala.inline
    def setConfigFileParsingDiagnostics(value: js.Array[Diagnostic]): Self = this.set("configFileParsingDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFileParsingDiagnostics: Self = this.set("configFileParsingDiagnostics", js.undefined)
    @scala.inline
    def setHost(value: CompilerHost): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setOldProgram(value: Program): Self = this.set("oldProgram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldProgram: Self = this.set("oldProgram", js.undefined)
    @scala.inline
    def setProjectReferencesVarargs(value: ProjectReference*): Self = this.set("projectReferences", js.Array(value :_*))
    @scala.inline
    def setProjectReferences(value: js.Array[ProjectReference]): Self = this.set("projectReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectReferences: Self = this.set("projectReferences", js.undefined)
  }
  
}

