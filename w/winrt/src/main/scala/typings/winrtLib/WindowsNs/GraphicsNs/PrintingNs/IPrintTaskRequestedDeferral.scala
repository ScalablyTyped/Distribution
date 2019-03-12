package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskRequestedDeferral extends js.Object {
  def complete(): scala.Unit
}

object IPrintTaskRequestedDeferral {
  @scala.inline
  def apply(complete: () => scala.Unit): IPrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IPrintTaskRequestedDeferral]
  }
}

