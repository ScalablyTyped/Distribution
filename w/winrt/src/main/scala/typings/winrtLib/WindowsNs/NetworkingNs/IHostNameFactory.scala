package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostNameFactory extends js.Object {
  def createHostName(hostName: java.lang.String): HostName
}

object IHostNameFactory {
  @scala.inline
  def apply(createHostName: js.Function1[java.lang.String, HostName]): IHostNameFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHostName")(createHostName)
    __obj.asInstanceOf[IHostNameFactory]
  }
}

