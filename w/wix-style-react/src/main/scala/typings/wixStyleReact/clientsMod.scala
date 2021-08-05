package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsMod {
  
  @JSImport("wix-style-react/dist/es/src/clients", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with clients
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/clients", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/clients", "default.GoogleMapsClient")
    @js.native
    def GoogleMapsClient: typings.wixStyleReact.clientsMod.GoogleMapsClient = js.native
    inline def GoogleMapsClient_=(x: GoogleMapsClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GoogleMapsClient")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/es/src/clients", "GoogleMapsClient")
  @js.native
  class GoogleMapsClient () extends StObject {
    
    def autocomplete(`object`: js.Any): js.Any = js.native
    
    def geocode(`object`: js.Any): js.Any = js.native
    
    def placeDetails(`object`: js.Any): js.Any = js.native
  }
  
  trait clients extends StObject
}
