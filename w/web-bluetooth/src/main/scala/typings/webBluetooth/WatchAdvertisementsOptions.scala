package typings.webBluetooth

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchAdvertisementsOptions extends StObject {
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object WatchAdvertisementsOptions {
  
  inline def apply(): WatchAdvertisementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchAdvertisementsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchAdvertisementsOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
