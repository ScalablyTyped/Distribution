package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterChange extends StObject {
  
  var afterChange: Any
  
  def appendDots(pages: Any): typings.react.mod.global.JSX.Element
  
  var arrows: Boolean
  
  var autoplay: Any
  
  var autoplaySpeed: Double
  
  var beforeChange: Any
  
  def customPaging(i: Any): typings.react.mod.global.JSX.Element
  
  var dots: Any
  
  var infinite: Any
  
  var initialSlide: Any
  
  var nextArrow: typings.react.mod.global.JSX.Element
  
  var prevArrow: typings.react.mod.global.JSX.Element
  
  var slidesToScroll: Double
  
  var slidesToShow: Double
  
  var speed: Double
  
  var variableWidth: Any
}
object AfterChange {
  
  inline def apply(
    afterChange: Any,
    appendDots: Any => typings.react.mod.global.JSX.Element,
    arrows: Boolean,
    autoplay: Any,
    autoplaySpeed: Double,
    beforeChange: Any,
    customPaging: Any => typings.react.mod.global.JSX.Element,
    dots: Any,
    infinite: Any,
    initialSlide: Any,
    nextArrow: typings.react.mod.global.JSX.Element,
    prevArrow: typings.react.mod.global.JSX.Element,
    slidesToScroll: Double,
    slidesToShow: Double,
    speed: Double,
    variableWidth: Any
  ): AfterChange = {
    val __obj = js.Dynamic.literal(afterChange = afterChange.asInstanceOf[js.Any], appendDots = js.Any.fromFunction1(appendDots), arrows = arrows.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], autoplaySpeed = autoplaySpeed.asInstanceOf[js.Any], beforeChange = beforeChange.asInstanceOf[js.Any], customPaging = js.Any.fromFunction1(customPaging), dots = dots.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], initialSlide = initialSlide.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], variableWidth = variableWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterChange]
  }
  
  extension [Self <: AfterChange](x: Self) {
    
    inline def setAfterChange(value: Any): Self = StObject.set(x, "afterChange", value.asInstanceOf[js.Any])
    
    inline def setAppendDots(value: Any => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "appendDots", js.Any.fromFunction1(value))
    
    inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setAutoplay(value: Any): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
    
    inline def setBeforeChange(value: Any): Self = StObject.set(x, "beforeChange", value.asInstanceOf[js.Any])
    
    inline def setCustomPaging(value: Any => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "customPaging", js.Any.fromFunction1(value))
    
    inline def setDots(value: Any): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setInfinite(value: Any): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInitialSlide(value: Any): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
    
    inline def setNextArrow(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
    
    inline def setPrevArrow(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
    
    inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setVariableWidth(value: Any): Self = StObject.set(x, "variableWidth", value.asInstanceOf[js.Any])
  }
}
