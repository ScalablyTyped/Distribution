package typings.webpackBlocksTypescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var babelCore: js.UndefOr[String] = js.native
  
  var babelOptions: js.UndefOr[BabelOptions] = js.native
  
  var cacheDirectory: js.UndefOr[String] = js.native
  
  var compiler: js.UndefOr[String] = js.native
  
  var configFileName: js.UndefOr[String] = js.native
  
  var errorsAsWarnings: js.UndefOr[Boolean] = js.native
  
  var forceIsolatedModules: js.UndefOr[Boolean] = js.native
  
  var getCustomTransformers: js.UndefOr[String | CustomTransformersFunction] = js.native
  
  var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.native
  
  var instance: js.UndefOr[String] = js.native
  
  var reportFiles: js.UndefOr[js.Array[String]] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var transpileOnly: js.UndefOr[Boolean] = js.native
  
  var useBabel: js.UndefOr[Boolean] = js.native
  
  var useCache: js.UndefOr[Boolean] = js.native
  
  var usePrecompiledFiles: js.UndefOr[Boolean] = js.native
  
  var useTranspileModule: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBabelCore(value: String): Self = this.set("babelCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelCore: Self = this.set("babelCore", js.undefined)
    
    @scala.inline
    def setBabelOptions(value: BabelOptions): Self = this.set("babelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelOptions: Self = this.set("babelOptions", js.undefined)
    
    @scala.inline
    def setCacheDirectory(value: String): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    
    @scala.inline
    def setCompiler(value: String): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setConfigFileName(value: String): Self = this.set("configFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFileName: Self = this.set("configFileName", js.undefined)
    
    @scala.inline
    def setErrorsAsWarnings(value: Boolean): Self = this.set("errorsAsWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorsAsWarnings: Self = this.set("errorsAsWarnings", js.undefined)
    
    @scala.inline
    def setForceIsolatedModules(value: Boolean): Self = this.set("forceIsolatedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIsolatedModules: Self = this.set("forceIsolatedModules", js.undefined)
    
    @scala.inline
    def setGetCustomTransformersFunction1(value: /* program */ js.Any => js.Any): Self = this.set("getCustomTransformers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCustomTransformers(value: String | CustomTransformersFunction): Self = this.set("getCustomTransformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCustomTransformers: Self = this.set("getCustomTransformers", js.undefined)
    
    @scala.inline
    def setIgnoreDiagnosticsVarargs(value: Double*): Self = this.set("ignoreDiagnostics", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDiagnostics(value: js.Array[Double]): Self = this.set("ignoreDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDiagnostics: Self = this.set("ignoreDiagnostics", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setReportFilesVarargs(value: String*): Self = this.set("reportFiles", js.Array(value :_*))
    
    @scala.inline
    def setReportFiles(value: js.Array[String]): Self = this.set("reportFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportFiles: Self = this.set("reportFiles", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTranspileOnly(value: Boolean): Self = this.set("transpileOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranspileOnly: Self = this.set("transpileOnly", js.undefined)
    
    @scala.inline
    def setUseBabel(value: Boolean): Self = this.set("useBabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBabel: Self = this.set("useBabel", js.undefined)
    
    @scala.inline
    def setUseCache(value: Boolean): Self = this.set("useCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCache: Self = this.set("useCache", js.undefined)
    
    @scala.inline
    def setUsePrecompiledFiles(value: Boolean): Self = this.set("usePrecompiledFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePrecompiledFiles: Self = this.set("usePrecompiledFiles", js.undefined)
    
    @scala.inline
    def setUseTranspileModule(value: Boolean): Self = this.set("useTranspileModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTranspileModule: Self = this.set("useTranspileModule", js.undefined)
  }
}
