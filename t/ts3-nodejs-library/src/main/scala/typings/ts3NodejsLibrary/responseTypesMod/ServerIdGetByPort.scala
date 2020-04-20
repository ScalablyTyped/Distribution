package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerIdGetByPort extends js.Object {
  var server_id: Double
}

object ServerIdGetByPort {
  @scala.inline
  def apply(server_id: Double): ServerIdGetByPort = {
    val __obj = js.Dynamic.literal(server_id = server_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerIdGetByPort]
  }
}

