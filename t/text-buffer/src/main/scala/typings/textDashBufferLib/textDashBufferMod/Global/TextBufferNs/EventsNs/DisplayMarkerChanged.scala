package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMarkerChanged extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: scala.Boolean
  /** Boolean indicating whether the marker now has a tail */
  var hasTail: scala.Boolean
  /** Boolean indicating whether the marker is now valid. */
  var isValid: scala.Boolean
  /** Point representing the new head buffer position. */
  var newHeadBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** Point representing the new head screen position. */
  var newHeadScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /**
    *  Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object
  /** Point representing the new tail buffer position. */
  var newTailBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** Point representing the new tail screen position. */
  var newTailScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** Point representing the former head buffer position. */
  var oldHeadBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** Point representing the former head screen position. */
  var oldHeadScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /**
    *  Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object
  // Point representing the former tail buffer position. */
  var oldTailBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** Point representing the former tail screen position. */
  var oldTailScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /**
    *  Boolean indicating whether this change was caused by a textual change to the
    *  buffer or whether the marker was manipulated directly via its public API.
    */
  var textChanged: scala.Boolean
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: scala.Boolean
}

object DisplayMarkerChanged {
  @scala.inline
  def apply(
    hadTail: scala.Boolean,
    hasTail: scala.Boolean,
    isValid: scala.Boolean,
    newHeadBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    newHeadScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    newProperties: js.Object,
    newTailBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    newTailScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldHeadBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldHeadScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldProperties: js.Object,
    oldTailBufferPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldTailScreenPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    textChanged: scala.Boolean,
    wasValid: scala.Boolean
  ): DisplayMarkerChanged = {
    val __obj = js.Dynamic.literal(hadTail = hadTail, hasTail = hasTail, isValid = isValid, newHeadBufferPosition = newHeadBufferPosition, newHeadScreenPosition = newHeadScreenPosition, newProperties = newProperties, newTailBufferPosition = newTailBufferPosition, newTailScreenPosition = newTailScreenPosition, oldHeadBufferPosition = oldHeadBufferPosition, oldHeadScreenPosition = oldHeadScreenPosition, oldProperties = oldProperties, oldTailBufferPosition = oldTailBufferPosition, oldTailScreenPosition = oldTailScreenPosition, textChanged = textChanged, wasValid = wasValid)
  
    __obj.asInstanceOf[DisplayMarkerChanged]
  }
}

