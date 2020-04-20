package typings.vastClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<vast-client.vast-client.VastError, 'ERRORCODE'> */
trait PickVastErrorERRORCODE extends js.Object {
  var ERRORCODE: String | Double
}

object PickVastErrorERRORCODE {
  @scala.inline
  def apply(ERRORCODE: String | Double): PickVastErrorERRORCODE = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickVastErrorERRORCODE]
  }
}

