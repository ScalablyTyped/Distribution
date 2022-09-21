package typings.webostvjs.mod

import typings.webostvjs.anon.`3dMode`
import typings.webostvjs.webostvjsStrings.HLS
import typings.webostvjs.webostvjsStrings.URI
import typings.webostvjs.webostvjsStrings.WIDEVINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaOptions extends StObject {
  
  var mediaTransportType: js.UndefOr[URI | WIDEVINE | HLS] = js.undefined
  
  var option: `3dMode`
}
object MediaOptions {
  
  inline def apply(option: `3dMode`): MediaOptions = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOptions]
  }
  
  extension [Self <: MediaOptions](x: Self) {
    
    inline def setMediaTransportType(value: URI | WIDEVINE | HLS): Self = StObject.set(x, "mediaTransportType", value.asInstanceOf[js.Any])
    
    inline def setMediaTransportTypeUndefined: Self = StObject.set(x, "mediaTransportType", js.undefined)
    
    inline def setOption(value: `3dMode`): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
