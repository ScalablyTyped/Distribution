package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintManagerStatic extends js.Object {
  def getForCurrentView(): PrintManager
  def showPrintUIAsync(): IAsyncOperation[Boolean]
}

object IPrintManagerStatic {
  @scala.inline
  def apply(getForCurrentView: () => PrintManager, showPrintUIAsync: () => IAsyncOperation[Boolean]): IPrintManagerStatic = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPrintUIAsync = js.Any.fromFunction0(showPrintUIAsync))
  
    __obj.asInstanceOf[IPrintManagerStatic]
  }
}

