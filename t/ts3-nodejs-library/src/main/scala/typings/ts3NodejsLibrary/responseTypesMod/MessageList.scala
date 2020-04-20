package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageList extends js.Object {
  var cluid: String
  var flag_read: Double
  var msgid: Double
  var subject: String
  var timestamp: Double
}

object MessageList {
  @scala.inline
  def apply(cluid: String, flag_read: Double, msgid: Double, subject: String, timestamp: Double): MessageList = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], flag_read = flag_read.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageList]
  }
}

