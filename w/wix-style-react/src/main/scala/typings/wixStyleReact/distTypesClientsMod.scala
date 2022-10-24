package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClientsMod {
  
  @JSImport("wix-style-react/dist/types/clients", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with clients
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/clients", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/clients", "default.GoogleMapsClient")
    @js.native
    def GoogleMapsClient: typings.wixStyleReact.distTypesClientsMod.GoogleMapsClient = js.native
    inline def GoogleMapsClient_=(x: GoogleMapsClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GoogleMapsClient")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/clients", "GoogleMapsClient")
  @js.native
  open class GoogleMapsClient () extends StObject {
    
    def autocomplete(`object`: Any): Any = js.native
    
    def geocode(`object`: Any): Any = js.native
    
    def placeDetails(`object`: Any): Any = js.native
  }
  
  trait clients extends StObject
}
