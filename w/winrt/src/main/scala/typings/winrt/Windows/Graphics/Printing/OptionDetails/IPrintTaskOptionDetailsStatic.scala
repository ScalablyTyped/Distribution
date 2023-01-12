package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Graphics.Printing.PrintTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskOptionDetailsStatic extends StObject {
  
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails
}
object IPrintTaskOptionDetailsStatic {
  
  inline def apply(getFromPrintTaskOptions: PrintTaskOptions => PrintTaskOptionDetails): IPrintTaskOptionDetailsStatic = {
    val __obj = js.Dynamic.literal(getFromPrintTaskOptions = js.Any.fromFunction1(getFromPrintTaskOptions))
    __obj.asInstanceOf[IPrintTaskOptionDetailsStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPrintTaskOptionDetailsStatic] (val x: Self) extends AnyVal {
    
    inline def setGetFromPrintTaskOptions(value: PrintTaskOptions => PrintTaskOptionDetails): Self = StObject.set(x, "getFromPrintTaskOptions", js.Any.fromFunction1(value))
  }
}
