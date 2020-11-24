package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintManagerStatic extends js.Object {
  
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
  implicit class IPrintManagerStaticOps[Self <: IPrintManagerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetForCurrentView(value: () => PrintManager): Self = this.set("getForCurrentView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPrintUIAsync(value: () => IAsyncOperation[Boolean]): Self = this.set("showPrintUIAsync", js.Any.fromFunction0(value))
  }
}
