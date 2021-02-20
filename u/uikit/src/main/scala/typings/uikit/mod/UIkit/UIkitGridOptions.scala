package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitGridOptions extends StObject {
  
  var `first-column`: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[String] = js.native
  
  var masonry: js.UndefOr[Boolean] = js.native
  
  var parallax: js.UndefOr[Double] = js.native
}
object UIkitGridOptions {
  
  @scala.inline
  def apply(): UIkitGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitGridOptions]
  }
  
  @scala.inline
  implicit class UIkitGridOptionsMutableBuilder[Self <: UIkitGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFirst-column`(value: String): Self = StObject.set(x, "first-column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFirst-columnUndefined`: Self = StObject.set(x, "first-column", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMasonry(value: Boolean): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasonryUndefined: Self = StObject.set(x, "masonry", js.undefined)
    
    @scala.inline
    def setParallax(value: Double): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
  }
}
