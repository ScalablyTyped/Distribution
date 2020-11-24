package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import typings.vueCompilerCore.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCTemplateCompileOptions extends js.Object {
  
  var compiler: js.UndefOr[TemplateCompiler] = js.native
  
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  
  var filename: String = js.native
  
  var inMap: js.UndefOr[RawSourceMap] = js.native
  
  /**
    * In some cases, compiler-sfc may not be inside the project root (e.g. when
    * linked or globally installed). In such cases a custom `require` can be
    * passed to correctly resolve the preprocessors.
    */
  var preprocessCustomRequire: js.UndefOr[js.Function1[/* id */ String, _]] = js.native
  
  var preprocessLang: js.UndefOr[String] = js.native
  
  var preprocessOptions: js.UndefOr[js.Any] = js.native
  
  var source: String = js.native
  
  var ssr: js.UndefOr[Boolean] = js.native
  
  /**
    * Configure what tags/attributes to transform into asset url imports,
    * or disable the transform altogether with `false`.
    */
  var transformAssetUrls: js.UndefOr[AssetURLOptions | AssetURLTagConfig | Boolean] = js.native
}
object SFCTemplateCompileOptions {
  
  @scala.inline
  def apply(filename: String, source: String): SFCTemplateCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCTemplateCompileOptions]
  }
  
  @scala.inline
  implicit class SFCTemplateCompileOptionsOps[Self <: SFCTemplateCompileOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiler(value: TemplateCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setInMap(value: RawSourceMap): Self = this.set("inMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInMap: Self = this.set("inMap", js.undefined)
    
    @scala.inline
    def setPreprocessCustomRequire(value: /* id */ String => _): Self = this.set("preprocessCustomRequire", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreprocessCustomRequire: Self = this.set("preprocessCustomRequire", js.undefined)
    
    @scala.inline
    def setPreprocessLang(value: String): Self = this.set("preprocessLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocessLang: Self = this.set("preprocessLang", js.undefined)
    
    @scala.inline
    def setPreprocessOptions(value: js.Any): Self = this.set("preprocessOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocessOptions: Self = this.set("preprocessOptions", js.undefined)
    
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    
    @scala.inline
    def setTransformAssetUrls(value: AssetURLOptions | AssetURLTagConfig | Boolean): Self = this.set("transformAssetUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformAssetUrls: Self = this.set("transformAssetUrls", js.undefined)
  }
}
