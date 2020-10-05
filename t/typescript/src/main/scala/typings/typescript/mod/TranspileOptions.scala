package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranspileOptions extends js.Object {
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  var fileName: js.UndefOr[java.lang.String] = js.native
  var moduleName: js.UndefOr[java.lang.String] = js.native
  var renamedDependencies: js.UndefOr[MapLike[java.lang.String]] = js.native
  var reportDiagnostics: js.UndefOr[Boolean] = js.native
  var transformers: js.UndefOr[CustomTransformers] = js.native
}

object TranspileOptions {
  @scala.inline
  def apply(): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranspileOptions]
  }
  @scala.inline
  implicit class TranspileOptionsOps[Self <: TranspileOptions] (val x: Self) extends AnyVal {
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
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    @scala.inline
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setModuleName(value: java.lang.String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleName: Self = this.set("moduleName", js.undefined)
    @scala.inline
    def setRenamedDependencies(value: MapLike[java.lang.String]): Self = this.set("renamedDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenamedDependencies: Self = this.set("renamedDependencies", js.undefined)
    @scala.inline
    def setReportDiagnostics(value: Boolean): Self = this.set("reportDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDiagnostics: Self = this.set("reportDiagnostics", js.undefined)
    @scala.inline
    def setTransformers(value: CustomTransformers): Self = this.set("transformers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformers: Self = this.set("transformers", js.undefined)
  }
  
}

