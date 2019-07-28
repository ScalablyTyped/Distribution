package typings.winrt.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostNameStatics extends js.Object {
  def compare(value1: String, value2: String): Double
}

object IHostNameStatics {
  @scala.inline
  def apply(compare: (String, String) => Double): IHostNameStatics = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
  
    __obj.asInstanceOf[IHostNameStatics]
  }
}

