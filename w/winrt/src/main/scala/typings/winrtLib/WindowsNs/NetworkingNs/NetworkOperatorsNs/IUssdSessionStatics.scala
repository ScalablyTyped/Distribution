package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSessionStatics extends js.Object {
  def createFromNetworkAccountId(networkAccountId: java.lang.String): UssdSession
  def createFromNetworkInterfaceId(networkInterfaceId: java.lang.String): UssdSession
}

object IUssdSessionStatics {
  @scala.inline
  def apply(
    createFromNetworkAccountId: java.lang.String => UssdSession,
    createFromNetworkInterfaceId: java.lang.String => UssdSession
  ): IUssdSessionStatics = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId), createFromNetworkInterfaceId = js.Any.fromFunction1(createFromNetworkInterfaceId))
  
    __obj.asInstanceOf[IUssdSessionStatics]
  }
}

