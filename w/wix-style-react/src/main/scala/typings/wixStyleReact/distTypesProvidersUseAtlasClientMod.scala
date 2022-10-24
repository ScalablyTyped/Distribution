package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.AutocompleteClient
import typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.UseAutocompleteClient
import typings.wixStyleReact.wixStyleReactStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseAtlasClientMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/providers/useAtlasClient", JSImport.Default)
  @js.native
  val default: UseAutocompleteClient[AtlasClient, AtlasInitOptions] = js.native
  
  type AtlasClient = AutocompleteClient[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prediction */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any, 
    AtlasRequestOptions
  ]
  
  trait AtlasInitOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object AtlasInitOptions {
    
    inline def apply(): AtlasInitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtlasInitOptions]
    }
    
    extension [Self <: AtlasInitOptions](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  type AtlasRequestOptions = OmitPolyfill[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PredictRequest */ Any, 
    input
  ]
  
  type _To = UseAutocompleteClient[AtlasClient, AtlasInitOptions]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesProvidersUseAtlasClientMod.foo` */
  override def _to: UseAutocompleteClient[AtlasClient, AtlasInitOptions] = default
}
