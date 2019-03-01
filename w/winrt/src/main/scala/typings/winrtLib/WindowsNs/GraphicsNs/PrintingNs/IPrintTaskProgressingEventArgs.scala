package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskProgressingEventArgs extends js.Object {
  var documentPageCount: scala.Double
}

object IPrintTaskProgressingEventArgs {
  @scala.inline
  def apply(documentPageCount: scala.Double): IPrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("documentPageCount")(documentPageCount)
    __obj.asInstanceOf[IPrintTaskProgressingEventArgs]
  }
}

