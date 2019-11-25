package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelDelete extends js.Object {
  var cid: Double
  var invoker: TeamSpeakClient
}

object ChannelDelete {
  @scala.inline
  def apply(cid: Double, invoker: TeamSpeakClient): ChannelDelete = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelDelete]
  }
}

