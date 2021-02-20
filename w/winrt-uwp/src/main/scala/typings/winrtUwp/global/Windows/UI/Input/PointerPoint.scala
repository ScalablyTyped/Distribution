package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.UI.Input.IPointerPointTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
abstract class PointerPoint ()
  extends typings.winrtUwp.Windows.UI.Input.PointerPoint
object PointerPoint {
  
  /**
    * Retrieves position and state information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @return The pointer property values.
    */
  /* static member */
  @JSGlobal("Windows.UI.Input.PointerPoint.getCurrentPoint")
  @js.native
  def getCurrentPoint(pointerId: Double): typings.winrtUwp.Windows.UI.Input.PointerPoint = js.native
  /**
    * Retrieves the transformed information for the specified pointer.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The pointer property values.
    */
  /* static member */
  @JSGlobal("Windows.UI.Input.PointerPoint.getCurrentPoint")
  @js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typings.winrtUwp.Windows.UI.Input.PointerPoint = js.native
  
  /**
    * Retrieves position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  /* static member */
  @JSGlobal("Windows.UI.Input.PointerPoint.getIntermediatePoints")
  @js.native
  def getIntermediatePoints(pointerId: Double): IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint] = js.native
  /**
    * Retrieves the transformed position and state information for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerId The ID of the pointer.
    * @param transform The transform to apply to the pointer.
    * @return The transformed pointer properties (current and historic).
    */
  /* static member */
  @JSGlobal("Windows.UI.Input.PointerPoint.getIntermediatePoints")
  @js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typings.winrtUwp.Windows.UI.Input.PointerPoint] = js.native
}
