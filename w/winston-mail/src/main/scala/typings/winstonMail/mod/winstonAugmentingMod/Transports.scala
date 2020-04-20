package typings.winstonMail.mod.winstonAugmentingMod

import typings.winstonMail.mod.Mail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var Mail: typings.winstonMail.mod.Mail
}

object Transports {
  @scala.inline
  def apply(Mail: Mail): Transports = {
    val __obj = js.Dynamic.literal(Mail = Mail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
}

