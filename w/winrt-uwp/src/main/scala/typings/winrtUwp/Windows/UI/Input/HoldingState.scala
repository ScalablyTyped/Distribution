package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HoldingState extends StObject
/** Specifies the state of the Holding event. */
@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends StObject {
  
  /** An additional contact is detected, a subsequent gesture (such as a slide) is detected, or the CompleteGesture method is called. */
  @js.native
  sealed trait canceled
    extends StObject
       with HoldingState
  
  /** The single contact is lifted. */
  @js.native
  sealed trait completed
    extends StObject
       with HoldingState
  
  /** A single contact has been detected and a time threshold is crossed without the contact being lifted, another contact detected, or another gesture started. */
  @js.native
  sealed trait started
    extends StObject
       with HoldingState
}
