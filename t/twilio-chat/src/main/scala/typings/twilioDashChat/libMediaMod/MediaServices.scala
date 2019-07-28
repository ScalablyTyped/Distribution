package typings.twilioDashChat.libMediaMod

import typings.twilioDashMcsDashClient.twilioDashMcsDashClientMod.McsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaServices extends js.Object {
  var mcsClient: McsClient
}

object MediaServices {
  @scala.inline
  def apply(mcsClient: McsClient): MediaServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient)
  
    __obj.asInstanceOf[MediaServices]
  }
}

