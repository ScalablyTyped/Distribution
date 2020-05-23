package typings.winrtUwp.global.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to defer the request for a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskRequestedDeferral")
@js.native
abstract class PrintTaskRequestedDeferral ()
  extends typings.winrtUwp.Windows.Graphics.Printing.PrintTaskRequestedDeferral {
  /** Indicates when the deferral for the print task request is over. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

