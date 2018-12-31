package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSourceRequestedArgs extends js.Object {
  var deadline: stdLib.Date
  def getDeferral(): PrintTaskSourceRequestedDeferral
  def setSource(source: IPrintDocumentSource): scala.Unit
}

