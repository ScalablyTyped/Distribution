package typings.svelteLeafletjs.anon

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.ImageOverlay_
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
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

trait GetImageOverlay extends StObject {
  
  var bounds: LatLngBoundsExpression
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getImageOverlay: js.UndefOr[js.Function0[ImageOverlay_]] = js.undefined
  
  var imageUrl: String
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[ImageOverlayOptions] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object GetImageOverlay {
  
  inline def apply(bounds: LatLngBoundsExpression, imageUrl: String): GetImageOverlay = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageOverlay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImageOverlay] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (click | dblclick | mousedown | mouseover | mouseout | contextmenu | add | remove | popupopen | popupclose)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetImageOverlay(value: () => ImageOverlay_): Self = StObject.set(x, "getImageOverlay", js.Any.fromFunction0(value))
    
    inline def setGetImageOverlayUndefined: Self = StObject.set(x, "getImageOverlay", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptions(value: ImageOverlayOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
