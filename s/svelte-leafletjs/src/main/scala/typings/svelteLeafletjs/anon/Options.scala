package typings.svelteLeafletjs.anon

import typings.leaflet.mod.PopupOptions
import typings.leaflet.mod.Popup_
import typings.svelteLeafletjs.mod.PathEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.add
import typings.svelteLeafletjs.svelteLeafletjsStrings.click
import typings.svelteLeafletjs.svelteLeafletjsStrings.contextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.dblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.mousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.popupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.popupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getPopup: js.UndefOr[js.Function0[Popup_]] = js.undefined
  
  var options: js.UndefOr[PopupOptions] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (click | dblclick | mousedown | mouseover | mouseout | contextmenu | add | remove | popupopen | popupclose)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetPopup(value: () => Popup_): Self = StObject.set(x, "getPopup", js.Any.fromFunction0(value))
    
    inline def setGetPopupUndefined: Self = StObject.set(x, "getPopup", js.undefined)
    
    inline def setOptions(value: PopupOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
