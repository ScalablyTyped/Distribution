package typings.svelteLeafletjs.anon

import typings.leaflet.mod.TooltipOptions
import typings.svelteLeafletjs.mod.PathEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.onadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.onremove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTooltip extends StObject {
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getTooltip: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var options: js.UndefOr[TooltipOptions] = js.undefined
}
object GetTooltip {
  
  inline def apply(): GetTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTooltip] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmouseover | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetTooltip(value: () => GetTooltip): Self = StObject.set(x, "getTooltip", js.Any.fromFunction0(value))
    
    inline def setGetTooltipUndefined: Self = StObject.set(x, "getTooltip", js.undefined)
    
    inline def setOptions(value: TooltipOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
