package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionDetailsStatic extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails
}

object IPrintTaskOptionDetailsStatic {
  @scala.inline
  def apply(getFromPrintTaskOptions: PrintTaskOptions => PrintTaskOptionDetails): IPrintTaskOptionDetailsStatic = {
    val __obj = js.Dynamic.literal(getFromPrintTaskOptions = js.Any.fromFunction1(getFromPrintTaskOptions))
  
    __obj.asInstanceOf[IPrintTaskOptionDetailsStatic]
  }
}

