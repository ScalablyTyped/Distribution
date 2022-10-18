package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeElementScreenshotOptions
  extends StObject
     with ActionOptions {
  
  /**
    * Allows to crop the target element on the screenshot.
    */
  var crop: js.UndefOr[CropOptions] = js.undefined
  
  /**
    * Controls if element's borders should be included in the screenshot.
    * Set this property to `true` to include target element's borders in the screenshot.
    * When it is enabled, the `scrollTargetX`, `scrollTargetY` and `crop` rectangle coordinates are calculated from
    * the corners where top and left (or bottom and right) internal edges of the element  intersect
    */
  var includeBorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if element's margins should be included in the screenshot.
    * Set this property to `true` to include target element's margins in the screenshot.
    * When it is enabled, the `scrollTargetX`, `scrollTargetY` and `crop` rectangle coordinates are calculated from
    * the corners where top and left (or bottom and right) margins intersect
    */
  var includeMargins: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if element's paddings should be included in the screenshot.
    * Set this property to `true` to include target element's paddings in the screenshot.
    * When it is enabled, the `scrollTargetX`, `scrollTargetY` and `crop` rectangle coordinates are calculated from
    * the corners where top and left (or bottom and right) edges of the element's content area intersect
    */
  var includePaddings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the X coordinate of the scrolling target point.
    * If the target element is too big to fit into the browser window, the page will be scrolled to put this point
    * to the center of the viewport. The coordinates of this point are calculated relative to the target element.
    * If the numbers are positive, the point is positioned relative to the top-left corner of the element.
    * If the numbers are negative, the point is positioned relative to the bottom-right corner.
    * If the target element fits into the browser window, these properties have no effect.
    */
  var scrollTargetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the Y coordinate of the scrolling target point.
    * If the target element is too big to fit into the browser window, the page will be scrolled to put this point
    * to the center of the viewport. The coordinates of this point are calculated relative to the target element.
    * If the numbers are positive, the point is positioned relative to the top-left corner of the element.
    * If the numbers are negative, the point is positioned relative to the bottom-right corner.
    * If the target element fits into the browser window, these properties have no effect.
    */
  var scrollTargetY: js.UndefOr[Double] = js.undefined
}
object TakeElementScreenshotOptions {
  
  inline def apply(): TakeElementScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakeElementScreenshotOptions]
  }
  
  extension [Self <: TakeElementScreenshotOptions](x: Self) {
    
    inline def setCrop(value: CropOptions): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setIncludeBorders(value: Boolean): Self = StObject.set(x, "includeBorders", value.asInstanceOf[js.Any])
    
    inline def setIncludeBordersUndefined: Self = StObject.set(x, "includeBorders", js.undefined)
    
    inline def setIncludeMargins(value: Boolean): Self = StObject.set(x, "includeMargins", value.asInstanceOf[js.Any])
    
    inline def setIncludeMarginsUndefined: Self = StObject.set(x, "includeMargins", js.undefined)
    
    inline def setIncludePaddings(value: Boolean): Self = StObject.set(x, "includePaddings", value.asInstanceOf[js.Any])
    
    inline def setIncludePaddingsUndefined: Self = StObject.set(x, "includePaddings", js.undefined)
    
    inline def setScrollTargetX(value: Double): Self = StObject.set(x, "scrollTargetX", value.asInstanceOf[js.Any])
    
    inline def setScrollTargetXUndefined: Self = StObject.set(x, "scrollTargetX", js.undefined)
    
    inline def setScrollTargetY(value: Double): Self = StObject.set(x, "scrollTargetY", value.asInstanceOf[js.Any])
    
    inline def setScrollTargetYUndefined: Self = StObject.set(x, "scrollTargetY", js.undefined)
  }
}
