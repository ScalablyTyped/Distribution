package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.anon.PostTransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetUrlMod {
  
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/assetUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PostTransformNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PostTransformNode]
  inline def default(userOptions: Unit, transformAssetUrlsOption: TransformAssetUrlsOptions): PostTransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(userOptions.asInstanceOf[js.Any], transformAssetUrlsOption.asInstanceOf[js.Any])).asInstanceOf[PostTransformNode]
  inline def default(userOptions: AssetURLOptions): PostTransformNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userOptions.asInstanceOf[js.Any]).asInstanceOf[PostTransformNode]
  inline def default(userOptions: AssetURLOptions, transformAssetUrlsOption: TransformAssetUrlsOptions): PostTransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(userOptions.asInstanceOf[js.Any], transformAssetUrlsOption.asInstanceOf[js.Any])).asInstanceOf[PostTransformNode]
  
  type AssetURLOptions = StringDictionary[String | js.Array[String]]
  
  trait TransformAssetUrlsOptions extends StObject {
    
    /**
      * If base is provided, instead of transforming relative asset urls into
      * imports, they will be directly rewritten to absolute urls.
      */
    var base: js.UndefOr[String] = js.undefined
  }
  object TransformAssetUrlsOptions {
    
    inline def apply(): TransformAssetUrlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformAssetUrlsOptions]
    }
    
    extension [Self <: TransformAssetUrlsOptions](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    }
  }
}
