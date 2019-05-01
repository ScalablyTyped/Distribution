package typings
package twilioDashChatLib.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageServices extends js.Object {
  var mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient
  var session: twilioDashChatLib.libSessionMod.Session
}

object MessageServices {
  @scala.inline
  def apply(
    mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient,
    session: twilioDashChatLib.libSessionMod.Session
  ): MessageServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient, session = session)
  
    __obj.asInstanceOf[MessageServices]
  }
}

