package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintManagerStatic extends StObject {
  
  def getForCurrentView(): PrintManager = js.native
  
  def showPrintUIAsync(): IAsyncOperation[Boolean] = js.native
}
object IPrintManagerStatic {
  
  @scala.inline
  def apply(getForCurrentView: () => PrintManager, showPrintUIAsync: () => IAsyncOperation[Boolean]): IPrintManagerStatic = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPrintUIAsync = js.Any.fromFunction0(showPrintUIAsync))
    __obj.asInstanceOf[IPrintManagerStatic]
  }
  
  @scala.inline
  implicit class IPrintManagerStaticMutableBuilder[Self <: IPrintManagerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => PrintManager): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPrintUIAsync(value: () => IAsyncOperation[Boolean]): Self = StObject.set(x, "showPrintUIAsync", js.Any.fromFunction0(value))
  }
}
