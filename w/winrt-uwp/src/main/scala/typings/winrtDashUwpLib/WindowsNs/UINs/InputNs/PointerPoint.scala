package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
abstract class PointerPoint () extends js.Object {
  /** Gets the ID of an input frame. */
  var frameId: scala.Double = js.native
  /** Gets a value that indicates whether the physical entity (touch, pen/stylus, or mouse button) is pressed down. */
  var isInContact: scala.Boolean = js.native
  /** Gets information about the device associated with the input pointer. */
  var pointerDevice: winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDevice = js.native
  /** Gets a unique identifier for the input pointer. */
  var pointerId: scala.Double = js.native
  /** Gets the location of the pointer input in client coordinates. */
  var position: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets extended information about the input pointer. */
  var properties: PointerPointProperties = js.native
  /** Gets the raw location of the pointer input in client coordinates. */
  var rawPosition: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the time when the input occurred. */
  var timestamp: scala.Double = js.native
}

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  /**
    * Retrieves position and state information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: scala.Double): winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  /**
    * Retrieves the transformed information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: scala.Double, transform: winrtDashUwpLib.WindowsNs.UINs.InputNs.IPointerPointTransform): winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  /**
    * Retrieves position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint] = js.native
  /**
    * Retrieves the transformed position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: scala.Double, transform: winrtDashUwpLib.WindowsNs.UINs.InputNs.IPointerPointTransform): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint] = js.native
}

