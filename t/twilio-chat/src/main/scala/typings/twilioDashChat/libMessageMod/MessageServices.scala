package typings.twilioDashChat.libMessageMod

import typings.twilioDashChat.libSessionMod.Session
import typings.twilioDashMcsDashClient.twilioDashMcsDashClientMod.McsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageServices extends js.Object {
  var mcsClient: McsClient
  var session: Session
}

object MessageServices {
  @scala.inline
  def apply(mcsClient: McsClient, session: Session): MessageServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient, session = session)
  
    __obj.asInstanceOf[MessageServices]
  }
}

