package typings.ts3NodejsLibrary.eventsMod

import typings.std.Partial
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEdit extends js.Object {
  var invoker: TeamSpeakClient
  var modified: Partial[QueryResponseTypes]
  var reasonid: Double
}

object ServerEdit {
  @scala.inline
  def apply(invoker: TeamSpeakClient, modified: Partial[QueryResponseTypes], reasonid: Double): ServerEdit = {
    val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerEdit]
  }
}

