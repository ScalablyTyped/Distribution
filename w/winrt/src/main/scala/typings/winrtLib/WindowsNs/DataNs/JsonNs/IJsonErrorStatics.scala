package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonErrorStatics extends js.Object {
  def getStatus(hresult: scala.Double): JsonErrorStatus
}

object IJsonErrorStatics {
  @scala.inline
  def apply(getStatus: scala.Double => JsonErrorStatus): IJsonErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[IJsonErrorStatics]
  }
}

