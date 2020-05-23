package typings.winrtUwp.Windows.Graphics.Printing

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
  
}

