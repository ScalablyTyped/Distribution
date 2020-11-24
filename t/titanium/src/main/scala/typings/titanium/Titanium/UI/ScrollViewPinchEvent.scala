package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a pinch gesture.
  */
@js.native
trait ScrollViewPinchEvent extends ScrollViewBaseEvent {
  
  /**
    * The average distance between each of the pointers forming the gesture in progress through
    * the focal point.
    */
  var currentSpan: Double = js.native
  
  /**
    * The average X distance between each of the pointers forming the gesture in progress through
    * the focal point.
    */
  var currentSpanX: Double = js.native
  
  /**
    * The average Y distance between each of the pointers forming the gesture in progress through
    * the focal point.
    */
  var currentSpanY: Double = js.native
  
  /**
    * The X coordinate of the current gesture's focal point.
    */
  var focusX: Double = js.native
  
  /**
    * The Y coordinate of the current gesture's focal point.
    */
  var focusY: Double = js.native
  
  /**
    * Returns `true` if a scale gesture is in progress, `false` otherwise.
    */
  var inProgress: Boolean = js.native
  
  /**
    * The previous average distance between each of the pointers forming the gesture in progress through
    * the focal point.
    */
  var previousSpan: Double = js.native
  
  /**
    * The previous average X distance between each of the pointers forming the gesture in progress through
    * the focal point.
    */
  var previousSpanX: Double = js.native
  
  /**
    * The previous average Y distance between each of the pointers forming the gesture in progress through
    * the focal point.
    */
  var previousSpanY: Double = js.native
  
  /**
    * The scale factor relative to the points of the two touches in screen coordinates.
    */
  var scale: Double = js.native
  
  /**
    * The event time of the current event being processed.
    */
  var time: Double = js.native
  
  /**
    * The time difference in milliseconds between the previous accepted scaling event and the
    * current scaling event.
    */
  var timeDelta: Double = js.native
  
  /**
    * The velocity of the pinch in scale factor per second.
    */
  var velocity: Double = js.native
}
object ScrollViewPinchEvent {
  
  @scala.inline
  def apply(
    currentSpan: Double,
    currentSpanX: Double,
    currentSpanY: Double,
    focusX: Double,
    focusY: Double,
    inProgress: Boolean,
    previousSpan: Double,
    previousSpanX: Double,
    previousSpanY: Double,
    scale: Double,
    source: ScrollView,
    time: Double,
    timeDelta: Double,
    velocity: Double
  ): ScrollViewPinchEvent = {
    val __obj = js.Dynamic.literal(currentSpan = currentSpan.asInstanceOf[js.Any], currentSpanX = currentSpanX.asInstanceOf[js.Any], currentSpanY = currentSpanY.asInstanceOf[js.Any], focusX = focusX.asInstanceOf[js.Any], focusY = focusY.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], previousSpan = previousSpan.asInstanceOf[js.Any], previousSpanX = previousSpanX.asInstanceOf[js.Any], previousSpanY = previousSpanY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewPinchEvent]
  }
  
  @scala.inline
  implicit class ScrollViewPinchEventOps[Self <: ScrollViewPinchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentSpan(value: Double): Self = this.set("currentSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSpanX(value: Double): Self = this.set("currentSpanX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSpanY(value: Double): Self = this.set("currentSpanY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusX(value: Double): Self = this.set("focusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusY(value: Double): Self = this.set("focusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: Boolean): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSpan(value: Double): Self = this.set("previousSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSpanX(value: Double): Self = this.set("previousSpanX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSpanY(value: Double): Self = this.set("previousSpanY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDelta(value: Double): Self = this.set("timeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
}
