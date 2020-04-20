package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a pinch gesture.
		 */
trait TableViewPinchEvent extends TableViewBaseEvent {
  /**
  			 * The average distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var currentSpan: Double
  /**
  			 * The average X distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var currentSpanX: Double
  /**
  			 * The average Y distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var currentSpanY: Double
  /**
  			 * The X coordinate of the current gesture's focal point.
  			 */
  var focusX: Double
  /**
  			 * The Y coordinate of the current gesture's focal point.
  			 */
  var focusY: Double
  /**
  			 * Returns `true` if a scale gesture is in progress, `false` otherwise.
  			 */
  var inProgress: Boolean
  /**
  			 * The previous average distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var previousSpan: Double
  /**
  			 * The previous average X distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var previousSpanX: Double
  /**
  			 * The previous average Y distance between each of the pointers forming the gesture in progress through
  			 * the focal point.
  			 */
  var previousSpanY: Double
  /**
  			 * The scale factor relative to the points of the two touches in screen coordinates.
  			 */
  var scale: Double
  /**
  			 * The event time of the current event being processed.
  			 */
  var time: Double
  /**
  			 * The time difference in milliseconds between the previous accepted scaling event and the
  			 * current scaling event.
  			 */
  var timeDelta: Double
  /**
  			 * The velocity of the pinch in scale factor per second.
  			 */
  var velocity: Double
}

object TableViewPinchEvent {
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
    source: TableView,
    time: Double,
    timeDelta: Double,
    velocity: Double
  ): TableViewPinchEvent = {
    val __obj = js.Dynamic.literal(currentSpan = currentSpan.asInstanceOf[js.Any], currentSpanX = currentSpanX.asInstanceOf[js.Any], currentSpanY = currentSpanY.asInstanceOf[js.Any], focusX = focusX.asInstanceOf[js.Any], focusY = focusY.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], previousSpan = previousSpan.asInstanceOf[js.Any], previousSpanX = previousSpanX.asInstanceOf[js.Any], previousSpanY = previousSpanY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewPinchEvent]
  }
}

