package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintManagerStatic extends js.Object {
  def getForCurrentView(): PrintManager
  def showPrintUIAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
}

object IPrintManagerStatic {
  @scala.inline
  def apply(
    getForCurrentView: js.Function0[PrintManager],
    showPrintUIAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]]
  ): IPrintManagerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView)
    __obj.updateDynamic("showPrintUIAsync")(showPrintUIAsync)
    __obj.asInstanceOf[IPrintManagerStatic]
  }
}

