package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDevice
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Input.IPointerPointTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
abstract class PointerPoint ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.PointerPoint {
  
  /** Gets the ID of an input frame. */
  /* CompleteClass */
  var frameId: Double = js.native
  
  /** Gets a value that indicates whether the physical entity (touch, pen/stylus, or mouse button) is pressed down. */
  /* CompleteClass */
  var isInContact: Boolean = js.native
  
  /** Gets information about the device associated with the input pointer. */
  /* CompleteClass */
  var pointerDevice: PointerDevice = js.native
  
  /** Gets a unique identifier for the input pointer. */
  /* CompleteClass */
  var pointerId: Double = js.native
  
  /** Gets the location of the pointer input in client coordinates. */
  /* CompleteClass */
  var position: Point = js.native
  
  /** Gets extended information about the input pointer. */
  /* CompleteClass */
  var properties: typings.winrtUwp.Windows.UI.Input.PointerPointProperties = js.native
  
  /** Gets the raw location of the pointer input in client coordinates. */
  /* CompleteClass */
  var rawPosition: Point = js.native
  
  /** Gets the time when the input occurred. */
  /* CompleteClass */
  var timestamp: Double = js.native
}
object PointerPoint {
  
  @JSGlobal("Windows.UI.Input.PointerPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieves position and state information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @return The pointer property values.
    */
  /* static member */
  inline def getCurrentPoint(pointerId: Double): typings.winrtUwp.Windows.UI.Input.PointerPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPoint")(pointerId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.UI.Input.PointerPoint]
  /**
    * Retrieves the transformed information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The pointer property values.
    */
  /* static member */
  inline def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typings.winrtUwp.Windows.UI.Input.PointerPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPoint")(pointerId.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.UI.Input.PointerPoint]
  
  /**
    * Retrieves position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  /* static member */
  inline def getIntermediatePoints(pointerId: Double): IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntermediatePoints")(pointerId.asInstanceOf[js.Any]).asInstanceOf[IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint]]
  /**
    * Retrieves the transformed position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  /* static member */
  inline def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntermediatePoints")(pointerId.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint]]
}
