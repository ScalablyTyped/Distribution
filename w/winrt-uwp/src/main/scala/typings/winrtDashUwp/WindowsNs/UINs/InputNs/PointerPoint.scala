package typings.winrtDashUwp.WindowsNs.UINs.InputNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.InputNs.PointerDevice
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
abstract class PointerPoint () extends js.Object {
  /** Gets the ID of an input frame. */
  var frameId: Double = js.native
  /** Gets a value that indicates whether the physical entity (touch, pen/stylus, or mouse button) is pressed down. */
  var isInContact: Boolean = js.native
  /** Gets information about the device associated with the input pointer. */
  var pointerDevice: PointerDevice = js.native
  /** Gets a unique identifier for the input pointer. */
  var pointerId: Double = js.native
  /** Gets the location of the pointer input in client coordinates. */
  var position: Point = js.native
  /** Gets extended information about the input pointer. */
  var properties: PointerPointProperties = js.native
  /** Gets the raw location of the pointer input in client coordinates. */
  var rawPosition: Point = js.native
  /** Gets the time when the input occurred. */
  var timestamp: Double = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  /**
    * Retrieves position and state information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: Double): PointerPoint = js.native
  /**
    * Retrieves the transformed information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): PointerPoint = js.native
  /**
    * Retrieves position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: Double): IVector[PointerPoint] = js.native
  /**
    * Retrieves the transformed position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[PointerPoint] = js.native
}

