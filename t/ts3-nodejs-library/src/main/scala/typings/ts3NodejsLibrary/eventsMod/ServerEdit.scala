package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.anon.PartialQueryResponseTypes
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEdit extends js.Object {
  var invoker: TeamSpeakClient
  var modified: PartialQueryResponseTypes
  var reasonid: Double
}

object ServerEdit {
  @scala.inline
  def apply(invoker: TeamSpeakClient, modified: PartialQueryResponseTypes, reasonid: Double): ServerEdit = {
    val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEdit]
  }
}

