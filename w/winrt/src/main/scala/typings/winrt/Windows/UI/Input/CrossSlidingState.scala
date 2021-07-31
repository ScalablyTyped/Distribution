package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CrossSlidingState extends StObject
@JSGlobal("Windows.UI.Input.CrossSlidingState")
@js.native
object CrossSlidingState extends StObject {
  
  @js.native
  sealed trait completed
    extends StObject
       with CrossSlidingState
  
  @js.native
  sealed trait dragging
    extends StObject
       with CrossSlidingState
  
  @js.native
  sealed trait rearranging
    extends StObject
       with CrossSlidingState
  
  @js.native
  sealed trait selectSpeedBumping
    extends StObject
       with CrossSlidingState
  
  @js.native
  sealed trait selecting
    extends StObject
       with CrossSlidingState
  
  @js.native
  sealed trait speedBumping
    extends StObject
       with CrossSlidingState
  
  @js.native
  sealed trait started
    extends StObject
       with CrossSlidingState
}
