package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CrossSlidingState extends StObject
@JSGlobal("Windows.UI.Input.CrossSlidingState")
@js.native
object CrossSlidingState extends StObject {
  
  @js.native
  sealed trait completed extends CrossSlidingState
  
  @js.native
  sealed trait dragging extends CrossSlidingState
  
  @js.native
  sealed trait rearranging extends CrossSlidingState
  
  @js.native
  sealed trait selectSpeedBumping extends CrossSlidingState
  
  @js.native
  sealed trait selecting extends CrossSlidingState
  
  @js.native
  sealed trait speedBumping extends CrossSlidingState
  
  @js.native
  sealed trait started extends CrossSlidingState
}
