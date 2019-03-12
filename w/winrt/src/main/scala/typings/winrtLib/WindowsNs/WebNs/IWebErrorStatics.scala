package typings
package winrtLib.WindowsNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebErrorStatics extends js.Object {
  def getStatus(hresult: scala.Double): WebErrorStatus
}

object IWebErrorStatics {
  @scala.inline
  def apply(getStatus: scala.Double => WebErrorStatus): IWebErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[IWebErrorStatics]
  }
}

