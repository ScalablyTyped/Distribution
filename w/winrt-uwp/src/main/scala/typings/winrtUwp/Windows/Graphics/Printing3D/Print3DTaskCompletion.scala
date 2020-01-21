package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DTaskCompletion with Double] = js.native
  /* 0 */ @js.native
  object abandoned extends TopLevel[abandoned with Double]
  
  /* 1 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 2 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 3 */ @js.native
  object slicing extends TopLevel[slicing with Double]
  
  /* 4 */ @js.native
  object submitted extends TopLevel[submitted with Double]
  
}

