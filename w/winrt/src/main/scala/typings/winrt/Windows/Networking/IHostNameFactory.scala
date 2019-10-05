package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostNameFactory extends js.Object {
  def createHostName(hostName: String): HostName
}

object IHostNameFactory {
  @scala.inline
  def apply(createHostName: String => HostName): IHostNameFactory = {
    val __obj = js.Dynamic.literal(createHostName = js.Any.fromFunction1(createHostName))
  
    __obj.asInstanceOf[IHostNameFactory]
  }
}

