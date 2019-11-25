package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[_]] = js.undefined
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(errorMessage: String = null, shippingOptions: js.Array[_] = null): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

