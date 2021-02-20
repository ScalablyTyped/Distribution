package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user starts tracking the slider.
  */
@js.native
trait SliderStartEvent extends SliderBaseEvent {
  
  /**
    * False. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  
  /**
    * Current value of the slider.
    */
  var value: Double = js.native
}
object SliderStartEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, source: Slider, value: Double): SliderStartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStartEvent]
  }
  
  @scala.inline
  implicit class SliderStartEventMutableBuilder[Self <: SliderStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
