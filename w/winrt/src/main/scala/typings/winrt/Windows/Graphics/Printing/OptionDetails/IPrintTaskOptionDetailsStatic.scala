package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Graphics.Printing.PrintTaskOptions
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

