package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrintTaskRequest extends js.Object {
  var deadline: stdLib.Date
  def createPrintTask(title: java.lang.String, handler: PrintTaskSourceRequestedHandler): PrintTask
  def getDeferral(): PrintTaskRequestedDeferral
}

