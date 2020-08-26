package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenModifiers extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The token modifiers know by the client.
    */
  var tokenModifiers: js.Array[String] = js.native
  /**
    * The token types know by the client.
    */
  var tokenTypes: js.Array[String] = js.native
}

object TokenModifiers {
  @scala.inline
  def apply(tokenModifiers: js.Array[String], tokenTypes: js.Array[String]): TokenModifiers = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenModifiers]
  }
  @scala.inline
  implicit class TokenModifiersOps[Self <: TokenModifiers] (val x: Self) extends AnyVal {
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
    def setTokenModifiersVarargs(value: String*): Self = this.set("tokenModifiers", js.Array(value :_*))
    @scala.inline
    def setTokenModifiers(value: js.Array[String]): Self = this.set("tokenModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenTypesVarargs(value: String*): Self = this.set("tokenTypes", js.Array(value :_*))
    @scala.inline
    def setTokenTypes(value: js.Array[String]): Self = this.set("tokenTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
  }
  
}

