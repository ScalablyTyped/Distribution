package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDisconnect extends js.Object {
  var client: ClientList
  var event: js.Any
}

object ClientDisconnect {
  @scala.inline
  def apply(client: ClientList, event: js.Any): ClientDisconnect = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientDisconnect]
  }
}

