package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUssdMessageFactory extends js.Object {
  def createMessage(messageText: String): UssdMessage = js.native
}

object IUssdMessageFactory {
  @scala.inline
  def apply(createMessage: String => UssdMessage): IUssdMessageFactory = {
    val __obj = js.Dynamic.literal(createMessage = js.Any.fromFunction1(createMessage))
    __obj.asInstanceOf[IUssdMessageFactory]
  }
  @scala.inline
  implicit class IUssdMessageFactoryOps[Self <: IUssdMessageFactory] (val x: Self) extends AnyVal {
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
    def setCreateMessage(value: String => UssdMessage): Self = this.set("createMessage", js.Any.fromFunction1(value))
  }
  
}

