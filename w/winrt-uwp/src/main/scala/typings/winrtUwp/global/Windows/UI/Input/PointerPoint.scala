package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDevice
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Input.IPointerPointTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
abstract class PointerPoint ()
  extends typings.winrtUwp.Windows.UI.Input.PointerPoint {
  /** Gets the ID of an input frame. */
  /* CompleteClass */
  override var frameId: Double = js.native
  /** Gets a value that indicates whether the physical entity (touch, pen/stylus, or mouse button) is pressed down. */
  /* CompleteClass */
  override var isInContact: Boolean = js.native
  /** Gets information about the device associated with the input pointer. */
  /* CompleteClass */
  override var pointerDevice: PointerDevice = js.native
  /** Gets a unique identifier for the input pointer. */
  /* CompleteClass */
  override var pointerId: Double = js.native
  /** Gets the location of the pointer input in client coordinates. */
  /* CompleteClass */
  override var position: Point = js.native
  /** Gets extended information about the input pointer. */
  /* CompleteClass */
  override var properties: typings.winrtUwp.Windows.UI.Input.PointerPointProperties = js.native
  /** Gets the raw location of the pointer input in client coordinates. */
  /* CompleteClass */
  override var rawPosition: Point = js.native
  /** Gets the time when the input occurred. */
  /* CompleteClass */
  override var timestamp: Double = js.native
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
  def getCurrentPoint(pointerId: Double): typings.winrtUwp.Windows.UI.Input.PointerPoint = js.native
  /**
    * Retrieves the transformed information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The pointer property values.
    */
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typings.winrtUwp.Windows.UI.Input.PointerPoint = js.native
  /**
    * Retrieves position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: Double): IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint] = js.native
  /**
    * Retrieves the transformed position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint] = js.native
}

