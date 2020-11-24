package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Print3DTaskCompletion extends js.Object
/** Specifies the completion status of a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletion")
@js.native
object Print3DTaskCompletion extends js.Object {
  
  /** The request has been abandoned. */
  @js.native
  sealed trait abandoned extends Print3DTaskCompletion
  
  /** The request has been canceled. */
  @js.native
  sealed trait canceled extends Print3DTaskCompletion
  
  /** The request has failed. */
  @js.native
  sealed trait failed extends Print3DTaskCompletion
  
  /** The driver is preparing layer by layer slices of the 3D model for the printer. */
  @js.native
  sealed trait slicing extends Print3DTaskCompletion
  
  /** The request has been submitted successfully. */
  @js.native
  sealed trait submitted extends Print3DTaskCompletion
}
