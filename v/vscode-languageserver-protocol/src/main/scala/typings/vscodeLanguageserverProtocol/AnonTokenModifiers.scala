package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTokenModifiers extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The token modifiers know by the client.
    */
  var tokenModifiers: js.Array[String]
  /**
    * The token types know by the client.
    */
  var tokenTypes: js.Array[String]
}

object AnonTokenModifiers {
  @scala.inline
  def apply(
    tokenModifiers: js.Array[String],
    tokenTypes: js.Array[String],
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): AnonTokenModifiers = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTokenModifiers]
  }
}

