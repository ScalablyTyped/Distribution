package typings
package twilioDashChatLib.libMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaServices extends js.Object {
  var mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient
}

object MediaServices {
  @scala.inline
  def apply(mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient): MediaServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient)
  
    __obj.asInstanceOf[MediaServices]
  }
}

