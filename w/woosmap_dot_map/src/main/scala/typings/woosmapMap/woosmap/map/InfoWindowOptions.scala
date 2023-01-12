package typings.woosmapMap.woosmap.map

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoWindowOptions extends StObject {
  
  /**
    * Content to display in the InfoWindow.
    * This can be an HTML element, a plain-text string, or a string containing HTML.
    * The InfoWindow will be sized according to the content.
    */
  var content: js.UndefOr[String | Node | Null] = js.undefined
  
  /**
    * Disable auto-pan on open.
    * By default, the info window will pan the map so that it is fully visible when it opens.
    */
  var disableAutoPan: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Maximum width of the infowindow, regardless of content's width.
    * This value is only considered if it is set before a call to open.
    */
  var maxWidth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The offset, in pixels, of the tip of the info window from the point on the map at whose geographical
    * coordinates the info window is anchored.
    */
  var pixelOffset: js.UndefOr[Point] = js.undefined
}
object InfoWindowOptions {
  
  inline def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoPanNull: Self = StObject.set(x, "disableAutoPan", null)
    
    inline def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPixelOffset(value: Point): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
  }
}
