package typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events

import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMarkerChanged extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: Boolean
  /** Boolean indicating whether the marker now has a tail */
  var hasTail: Boolean
  /** Boolean indicating whether the marker is now valid. */
  var isValid: Boolean
  /** Point representing the new head buffer position. */
  var newHeadBufferPosition: Point
  /** Point representing the new head screen position. */
  var newHeadScreenPosition: Point
  /**
    *  Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object
  /** Point representing the new tail buffer position. */
  var newTailBufferPosition: Point
  /** Point representing the new tail screen position. */
  var newTailScreenPosition: Point
  /** Point representing the former head buffer position. */
  var oldHeadBufferPosition: Point
  /** Point representing the former head screen position. */
  var oldHeadScreenPosition: Point
  /**
    *  Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object
  // Point representing the former tail buffer position. */
  var oldTailBufferPosition: Point
  /** Point representing the former tail screen position. */
  var oldTailScreenPosition: Point
  /**
    *  Boolean indicating whether this change was caused by a textual change to the
    *  buffer or whether the marker was manipulated directly via its public API.
    */
  var textChanged: Boolean
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: Boolean
}

object DisplayMarkerChanged {
  @scala.inline
  def apply(
    hadTail: Boolean,
    hasTail: Boolean,
    isValid: Boolean,
    newHeadBufferPosition: Point,
    newHeadScreenPosition: Point,
    newProperties: js.Object,
    newTailBufferPosition: Point,
    newTailScreenPosition: Point,
    oldHeadBufferPosition: Point,
    oldHeadScreenPosition: Point,
    oldProperties: js.Object,
    oldTailBufferPosition: Point,
    oldTailScreenPosition: Point,
    textChanged: Boolean,
    wasValid: Boolean
  ): DisplayMarkerChanged = {
    val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadBufferPosition = newHeadBufferPosition.asInstanceOf[js.Any], newHeadScreenPosition = newHeadScreenPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailBufferPosition = newTailBufferPosition.asInstanceOf[js.Any], newTailScreenPosition = newTailScreenPosition.asInstanceOf[js.Any], oldHeadBufferPosition = oldHeadBufferPosition.asInstanceOf[js.Any], oldHeadScreenPosition = oldHeadScreenPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailBufferPosition = oldTailBufferPosition.asInstanceOf[js.Any], oldTailScreenPosition = oldTailScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayMarkerChanged]
  }
}

