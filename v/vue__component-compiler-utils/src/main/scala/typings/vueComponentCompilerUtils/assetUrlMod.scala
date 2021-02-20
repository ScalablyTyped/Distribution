package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.anon.PostTransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetUrlMod {
  
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/assetUrl", JSImport.Default)
  @js.native
  def default(): PostTransformNode = js.native
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/assetUrl", JSImport.Default)
  @js.native
  def default(userOptions: js.UndefOr[scala.Nothing], transformAssetUrlsOption: TransformAssetUrlsOptions): PostTransformNode = js.native
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/assetUrl", JSImport.Default)
  @js.native
  def default(userOptions: AssetURLOptions): PostTransformNode = js.native
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/assetUrl", JSImport.Default)
  @js.native
  def default(userOptions: AssetURLOptions, transformAssetUrlsOption: TransformAssetUrlsOptions): PostTransformNode = js.native
  
  type AssetURLOptions = StringDictionary[String | js.Array[String]]
  
  @js.native
  trait TransformAssetUrlsOptions extends StObject {
    
    /**
      * If base is provided, instead of transforming relative asset urls into
      * imports, they will be directly rewritten to absolute urls.
      */
    var base: js.UndefOr[String] = js.native
  }
  object TransformAssetUrlsOptions {
    
    @scala.inline
    def apply(): TransformAssetUrlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformAssetUrlsOptions]
    }
    
    @scala.inline
    implicit class TransformAssetUrlsOptionsMutableBuilder[Self <: TransformAssetUrlsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    }
  }
}
