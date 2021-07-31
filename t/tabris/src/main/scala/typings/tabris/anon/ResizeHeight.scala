package typings.tabris.anon

import typings.tabris.tabrisStrings.high
import typings.tabris.tabrisStrings.low
import typings.tabris.tabrisStrings.medium
import typings.tabris.tabrisStrings.pixelated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeHeight extends StObject {
  
  var resizeHeight: js.UndefOr[Double] = js.undefined
  
  var resizeQuality: js.UndefOr[pixelated | low | medium | high] = js.undefined
  
  var resizeWidth: js.UndefOr[Double] = js.undefined
}
object ResizeHeight {
  
  @scala.inline
  def apply(): ResizeHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeHeight]
  }
  
  @scala.inline
  implicit class ResizeHeightMutableBuilder[Self <: ResizeHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
    
    @scala.inline
    def setResizeQuality(value: pixelated | low | medium | high): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
    
    @scala.inline
    def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
  }
}
