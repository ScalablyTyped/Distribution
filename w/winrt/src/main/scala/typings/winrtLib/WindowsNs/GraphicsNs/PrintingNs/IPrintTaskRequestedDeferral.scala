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
  def apply(complete: js.Function0[scala.Unit]): IPrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[IPrintTaskRequestedDeferral]
  }
}

