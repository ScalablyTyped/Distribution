package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[T] extends js.Object {
  var bundle: js.Array[T]
}

object Bundle {
  @scala.inline
  def apply[T](bundle: js.Array[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle)
  
    __obj.asInstanceOf[Bundle[T]]
  }
}

