package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdMessageFactory extends js.Object {
  def createMessage(messageText: String): UssdMessage
}

object IUssdMessageFactory {
  @scala.inline
  def apply(createMessage: String => UssdMessage): IUssdMessageFactory = {
    val __obj = js.Dynamic.literal(createMessage = js.Any.fromFunction1(createMessage))
    __obj.asInstanceOf[IUssdMessageFactory]
  }
}

