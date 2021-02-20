package typings.titanium.Titanium.UI

import typings.titanium.Point
import typings.titanium.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the value of the slider changes.
  */
@js.native
trait SliderChangeEvent extends SliderBaseEvent {
  
  /**
    * True if change was made by the user. False if change was made programmatically.
    */
  var isTrusted: Boolean = js.native
  
  /**
    * Dictionary with properties `x` and `y` of the thumb's left-top corner in
    * the control. Available with custom thumb image.
    */
  var thumbOffset: Point = js.native
  
  /**
    * Dictionary with properties `width` and `height` of the size of the thumb.
    * Available with custom thumb image.
    */
  var thumbSize: Size = js.native
  
  /**
    * New value of the slider.
    */
  var value: Double = js.native
}
object SliderChangeEvent {
  
  @scala.inline
  def apply(isTrusted: Boolean, source: Slider, thumbOffset: Point, thumbSize: Size, value: Double): SliderChangeEvent = {
    val __obj = js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thumbOffset = thumbOffset.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderChangeEvent]
  }
  
  @scala.inline
  implicit class SliderChangeEventMutableBuilder[Self <: SliderChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbOffset(value: Point): Self = StObject.set(x, "thumbOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSize(value: Size): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
