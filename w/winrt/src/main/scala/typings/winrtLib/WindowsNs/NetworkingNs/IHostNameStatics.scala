package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostNameStatics extends js.Object {
  def compare(value1: java.lang.String, value2: java.lang.String): scala.Double
}

object IHostNameStatics {
  @scala.inline
  def apply(compare: (java.lang.String, java.lang.String) => scala.Double): IHostNameStatics = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
  
    __obj.asInstanceOf[IHostNameStatics]
  }
}

