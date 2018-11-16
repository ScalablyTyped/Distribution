package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrintManagerStatic extends js.Object {
  def getForCurrentView(): PrintManager
  def showPrintUIAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
}

