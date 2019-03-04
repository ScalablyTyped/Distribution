package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerChanged extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: scala.Boolean
  /** Boolean indicating whether the marker now has a tail. */
  var hasTail: scala.Boolean
  /** Boolean indicating whether the marker is now valid. */
  var isValid: scala.Boolean
  /** Point representing the new head position. */
  var newHeadPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /**
    *  Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object
  /** Point representing the new tail position. */
  var newTailPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** Point representing the former head position. */
  var oldHeadPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /**
    *  Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object
  /** Point representing the former tail position. */
  var oldTailPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /**
    *  Boolean indicating whether this change was caused by a textual
    *  change to the buffer or whether the marker was manipulated directly
    *  via its public API.
    */
  var textChanged: scala.Boolean
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: scala.Boolean
}

object MarkerChanged {
  @scala.inline
  def apply(
    hadTail: scala.Boolean,
    hasTail: scala.Boolean,
    isValid: scala.Boolean,
    newHeadPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    newProperties: js.Object,
    newTailPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldHeadPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldProperties: js.Object,
    oldTailPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    textChanged: scala.Boolean,
    wasValid: scala.Boolean
  ): MarkerChanged = {
    val __obj = js.Dynamic.literal(hadTail = hadTail, hasTail = hasTail, isValid = isValid, newHeadPosition = newHeadPosition, newProperties = newProperties, newTailPosition = newTailPosition, oldHeadPosition = oldHeadPosition, oldProperties = oldProperties, oldTailPosition = oldTailPosition, textChanged = textChanged, wasValid = wasValid)
  
    __obj.asInstanceOf[MarkerChanged]
  }
}

