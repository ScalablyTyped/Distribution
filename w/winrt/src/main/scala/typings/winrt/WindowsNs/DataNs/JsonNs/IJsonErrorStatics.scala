package typings.winrt.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonErrorStatics extends js.Object {
  def getStatus(hresult: Double): JsonErrorStatus
}

object IJsonErrorStatics {
  @scala.inline
  def apply(getStatus: Double => JsonErrorStatus): IJsonErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[IJsonErrorStatics]
  }
}

