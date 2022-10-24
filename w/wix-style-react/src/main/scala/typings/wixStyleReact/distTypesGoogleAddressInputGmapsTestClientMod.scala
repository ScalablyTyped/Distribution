package typings.wixStyleReact

import typings.wixStyleReact.anon.Addresscomponents
import typings.wixStyleReact.anon.DescriptionId
import typings.wixStyleReact.anon.Longname
import typings.wixStyleReact.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleAddressInputGmapsTestClientMod {
  
  object GEOCODE_RESULT {
    
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/gmapsTestClient", "GEOCODE_RESULT.address_components")
    @js.native
    val addressComponents: js.Array[Longname] = js.native
    
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/gmapsTestClient", "GEOCODE_RESULT.formatted_address")
    @js.native
    val formattedAddress: String = js.native
    
    object geometry {
      
      object location {
        
        @JSImport("wix-style-react/dist/types/GoogleAddressInput/gmapsTestClient", "GEOCODE_RESULT.geometry.location")
        @js.native
        val ^ : js.Any = js.native
        
        inline def lat(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lat")().asInstanceOf[Double]
        
        inline def lng(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lng")().asInstanceOf[Double]
      }
    }
  }
  
  @JSImport("wix-style-react/dist/types/GoogleAddressInput/gmapsTestClient", "GmapsTestClient")
  @js.native
  open class GmapsTestClient () extends StObject {
    
    def autocomplete(param0: Request): js.Promise[js.Array[DescriptionId]] = js.native
    
    def geocode(param0: Request): js.Promise[js.Array[Addresscomponents]] = js.native
    
    def placeDetails(param0: Request): js.Promise[js.Array[Addresscomponents]] = js.native
  }
  
  @JSImport("wix-style-react/dist/types/GoogleAddressInput/gmapsTestClient", "GmapsTestClientWithFields")
  @js.native
  open class GmapsTestClientWithFields () extends GmapsTestClient
}
