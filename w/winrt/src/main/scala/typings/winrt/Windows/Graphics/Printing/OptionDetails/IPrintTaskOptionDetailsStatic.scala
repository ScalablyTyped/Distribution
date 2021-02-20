package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Graphics.Printing.PrintTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskOptionDetailsStatic extends StObject {
  
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails = js.native
}
object IPrintTaskOptionDetailsStatic {
  
  @scala.inline
  def apply(getFromPrintTaskOptions: PrintTaskOptions => PrintTaskOptionDetails): IPrintTaskOptionDetailsStatic = {
    val __obj = js.Dynamic.literal(getFromPrintTaskOptions = js.Any.fromFunction1(getFromPrintTaskOptions))
    __obj.asInstanceOf[IPrintTaskOptionDetailsStatic]
  }
  
  @scala.inline
  implicit class IPrintTaskOptionDetailsStaticMutableBuilder[Self <: IPrintTaskOptionDetailsStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFromPrintTaskOptions(value: PrintTaskOptions => PrintTaskOptionDetails): Self = StObject.set(x, "getFromPrintTaskOptions", js.Any.fromFunction1(value))
  }
}
