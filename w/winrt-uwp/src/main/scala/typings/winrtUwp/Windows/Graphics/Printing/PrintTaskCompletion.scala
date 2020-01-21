package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintTaskCompletion extends js.Object

/** Specifies the completion status of a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends js.Object {
  /** An abandoned print task. */
  @js.native
  sealed trait abandoned extends PrintTaskCompletion
  
  /** A canceled print task. */
  @js.native
  sealed trait canceled extends PrintTaskCompletion
  
  /** A failed print task. */
  @js.native
  sealed trait failed extends PrintTaskCompletion
  
  /** A submitted print task. */
  @js.native
  sealed trait submitted extends PrintTaskCompletion
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintTaskCompletion with Double] = js.native
  /* 0 */ @js.native
  object abandoned extends TopLevel[abandoned with Double]
  
  /* 1 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 2 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 3 */ @js.native
  object submitted extends TopLevel[submitted with Double]
  
}

