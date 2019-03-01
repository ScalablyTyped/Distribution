package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionDetailsStatic extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskOptions): PrintTaskOptionDetails
}

object IPrintTaskOptionDetailsStatic {
  @scala.inline
  def apply(
    getFromPrintTaskOptions: js.Function1[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskOptions, PrintTaskOptionDetails]
  ): IPrintTaskOptionDetailsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFromPrintTaskOptions")(getFromPrintTaskOptions)
    __obj.asInstanceOf[IPrintTaskOptionDetailsStatic]
  }
}

