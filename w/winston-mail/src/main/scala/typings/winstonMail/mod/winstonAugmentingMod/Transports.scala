package typings.winstonMail.mod.winstonAugmentingMod

import typings.winstonMail.mod.Mail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transports extends js.Object {
  var Mail: typings.winstonMail.mod.Mail = js.native
}

object Transports {
  @scala.inline
  def apply(Mail: Mail): Transports = {
    val __obj = js.Dynamic.literal(Mail = Mail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMail(value: Mail): Self = this.set("Mail", value.asInstanceOf[js.Any])
  }
  
}

