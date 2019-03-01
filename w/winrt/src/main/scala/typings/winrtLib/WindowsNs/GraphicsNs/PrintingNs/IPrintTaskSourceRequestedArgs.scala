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

object IPrintTaskSourceRequestedArgs {
  @scala.inline
  def apply(
    deadline: stdLib.Date,
    getDeferral: js.Function0[PrintTaskSourceRequestedDeferral],
    setSource: js.Function1[IPrintDocumentSource, scala.Unit]
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deadline")(deadline)
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.updateDynamic("setSource")(setSource)
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
}

