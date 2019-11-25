package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConnect extends js.Object {
  var client: TeamSpeakClient
}

object ClientConnect {
  @scala.inline
  def apply(client: TeamSpeakClient): ClientConnect = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientConnect]
  }
}

