package typings.vueLoader.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueTemplateCompiler.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueLoaderOptions extends js.Object {
  
  var cacheDirectory: js.UndefOr[String] = js.native
  
  var cacheIdentifier: js.UndefOr[String] = js.native
  
  var compiler: js.UndefOr[VueTemplateCompiler] = js.native
  
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  
  var exposeFilename: js.UndefOr[Boolean] = js.native
  
  var hotReload: js.UndefOr[Boolean] = js.native
  
  var optimizeSSR: js.UndefOr[Boolean] = js.native
  
  var prettify: js.UndefOr[Boolean] = js.native
  
  var productionMode: js.UndefOr[Boolean] = js.native
  
  var shadowMode: js.UndefOr[Boolean] = js.native
  
  var transformAssetUrls: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  
  var transpileOptions: js.UndefOr[js.Object] = js.native
}
object VueLoaderOptions {
  
  @scala.inline
  def apply(): VueLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueLoaderOptions]
  }
  
  @scala.inline
  implicit class VueLoaderOptionsOps[Self <: VueLoaderOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheDirectory(value: String): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    
    @scala.inline
    def setCacheIdentifier(value: String): Self = this.set("cacheIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheIdentifier: Self = this.set("cacheIdentifier", js.undefined)
    
    @scala.inline
    def setCompiler(value: VueTemplateCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setExposeFilename(value: Boolean): Self = this.set("exposeFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeFilename: Self = this.set("exposeFilename", js.undefined)
    
    @scala.inline
    def setHotReload(value: Boolean): Self = this.set("hotReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotReload: Self = this.set("hotReload", js.undefined)
    
    @scala.inline
    def setOptimizeSSR(value: Boolean): Self = this.set("optimizeSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeSSR: Self = this.set("optimizeSSR", js.undefined)
    
    @scala.inline
    def setPrettify(value: Boolean): Self = this.set("prettify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettify: Self = this.set("prettify", js.undefined)
    
    @scala.inline
    def setProductionMode(value: Boolean): Self = this.set("productionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionMode: Self = this.set("productionMode", js.undefined)
    
    @scala.inline
    def setShadowMode(value: Boolean): Self = this.set("shadowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowMode: Self = this.set("shadowMode", js.undefined)
    
    @scala.inline
    def setTransformAssetUrls(value: StringDictionary[String | js.Array[String]]): Self = this.set("transformAssetUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformAssetUrls: Self = this.set("transformAssetUrls", js.undefined)
    
    @scala.inline
    def setTranspileOptions(value: js.Object): Self = this.set("transpileOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranspileOptions: Self = this.set("transpileOptions", js.undefined)
  }
}
