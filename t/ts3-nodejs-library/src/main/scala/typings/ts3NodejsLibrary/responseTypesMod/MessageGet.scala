package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageGet extends js.Object {
  var cluid: String
  var message: String
  var msgid: Double
  var subject: String
  var timestamp: Double
}

object MessageGet {
  @scala.inline
  def apply(cluid: String, message: String, msgid: Double, subject: String, timestamp: Double): MessageGet = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageGet]
  }
}

