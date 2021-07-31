package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Print3DTaskCompletion extends StObject
/** Specifies the completion status of a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletion")
@js.native
object Print3DTaskCompletion extends StObject {
  
  /** The request has been abandoned. */
  @js.native
  sealed trait abandoned
    extends StObject
       with Print3DTaskCompletion
  
  /** The request has been canceled. */
  @js.native
  sealed trait canceled
    extends StObject
       with Print3DTaskCompletion
  
  /** The request has failed. */
  @js.native
  sealed trait failed
    extends StObject
       with Print3DTaskCompletion
  
  /** The driver is preparing layer by layer slices of the 3D model for the printer. */
  @js.native
  sealed trait slicing
    extends StObject
       with Print3DTaskCompletion
  
  /** The request has been submitted successfully. */
  @js.native
  sealed trait submitted
    extends StObject
       with Print3DTaskCompletion
}
