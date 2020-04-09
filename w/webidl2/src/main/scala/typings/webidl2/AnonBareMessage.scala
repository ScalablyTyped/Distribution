package typings.webidl2

import typings.webidl2.mod.ValueDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBareMessage extends js.Object {
  var bareMessage: String
  var context: String
  var input: String
  var line: Double
  var message: String
  var sourceName: js.UndefOr[String] = js.undefined
  var tokens: js.Array[ValueDescription]
}

object AnonBareMessage {
  @scala.inline
  def apply(
    bareMessage: String,
    context: String,
    input: String,
    line: Double,
    message: String,
    tokens: js.Array[ValueDescription],
    sourceName: String = null
  ): AnonBareMessage = {
    val __obj = js.Dynamic.literal(bareMessage = bareMessage.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBareMessage]
  }
}

