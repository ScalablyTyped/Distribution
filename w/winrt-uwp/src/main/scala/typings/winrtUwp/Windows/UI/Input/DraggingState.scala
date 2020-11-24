package typings.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraggingState extends js.Object
/** Specifies the possible states of the Dragging event. */
@JSGlobal("Windows.UI.Input.DraggingState")
@js.native
object DraggingState extends js.Object {
  
  /** The mouse or pen/stylus contact is lifted and inertia has concluded. */
  @js.native
  sealed trait completed extends DraggingState
  
  /** The dragging interaction is in progress. */
  @js.native
  sealed trait continuing extends DraggingState
  
  /** A dragging interaction has been detected. */
  @js.native
  sealed trait started extends DraggingState
}
