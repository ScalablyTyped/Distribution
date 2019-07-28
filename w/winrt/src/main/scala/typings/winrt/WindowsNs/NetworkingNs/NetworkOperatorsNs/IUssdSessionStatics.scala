package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSessionStatics extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): UssdSession
  def createFromNetworkInterfaceId(networkInterfaceId: String): UssdSession
}

object IUssdSessionStatics {
  @scala.inline
  def apply(
    createFromNetworkAccountId: String => UssdSession,
    createFromNetworkInterfaceId: String => UssdSession
  ): IUssdSessionStatics = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId), createFromNetworkInterfaceId = js.Any.fromFunction1(createFromNetworkInterfaceId))
  
    __obj.asInstanceOf[IUssdSessionStatics]
  }
}

