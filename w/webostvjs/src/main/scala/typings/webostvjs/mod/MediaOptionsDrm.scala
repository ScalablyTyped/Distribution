package typings.webostvjs.mod

import typings.webostvjs.anon.SeperatedStream
import typings.webostvjs.webostvjsStrings.playready_
import typings.webostvjs.webostvjsStrings.widevine_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaOptionsDrm extends StObject {
  
  var clientId: String
  
  var `type`: widevine_ | playready_
  
  var widevine: js.UndefOr[SeperatedStream] = js.undefined
}
object MediaOptionsDrm {
  
  inline def apply(clientId: String, `type`: widevine_ | playready_): MediaOptionsDrm = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOptionsDrm]
  }
  
  extension [Self <: MediaOptionsDrm](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setType(value: widevine_ | playready_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidevine(value: SeperatedStream): Self = StObject.set(x, "widevine", value.asInstanceOf[js.Any])
    
    inline def setWidevineUndefined: Self = StObject.set(x, "widevine", js.undefined)
  }
}
