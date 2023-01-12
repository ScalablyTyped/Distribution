package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitGridOptions extends StObject {
  
  var `first-column`: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[String] = js.undefined
  
  var masonry: js.UndefOr[Boolean] = js.undefined
  
  var parallax: js.UndefOr[Double] = js.undefined
}
object UIkitGridOptions {
  
  inline def apply(): UIkitGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitGridOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitGridOptions] (val x: Self) extends AnyVal {
    
    inline def `setFirst-column`(value: String): Self = StObject.set(x, "first-column", value.asInstanceOf[js.Any])
    
    inline def `setFirst-columnUndefined`: Self = StObject.set(x, "first-column", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMasonry(value: Boolean): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
    
    inline def setMasonryUndefined: Self = StObject.set(x, "masonry", js.undefined)
    
    inline def setParallax(value: Double): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
    
    inline def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
  }
}
