package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the zoom scale factor changes.
  */
@js.native
trait ScrollViewScaleEvent extends ScrollViewBaseEvent {
  
  /**
    * New scaling factor as a float.
    */
  var scale: Double = js.native
}
object ScrollViewScaleEvent {
  
  @scala.inline
  def apply(scale: Double, source: ScrollView): ScrollViewScaleEvent = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewScaleEvent]
  }
  
  @scala.inline
  implicit class ScrollViewScaleEventMutableBuilder[Self <: ScrollViewScaleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
