package typings.trustedTypes.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedTypePolicy extends js.Object {
  val name: String = js.native
  def createHTML(input: String): TrustedHTML = js.native
  def createScript(input: String): TrustedScript = js.native
  def createScriptURL(input: String): TrustedScriptURL = js.native
  def createURL(input: String): TrustedURL = js.native
}

object TrustedTypePolicy {
  @scala.inline
  def apply(
    createHTML: String => TrustedHTML,
    createScript: String => TrustedScript,
    createScriptURL: String => TrustedScriptURL,
    createURL: String => TrustedURL,
    name: String
  ): TrustedTypePolicy = {
    val __obj = js.Dynamic.literal(createHTML = js.Any.fromFunction1(createHTML), createScript = js.Any.fromFunction1(createScript), createScriptURL = js.Any.fromFunction1(createScriptURL), createURL = js.Any.fromFunction1(createURL), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedTypePolicy]
  }
  @scala.inline
  implicit class TrustedTypePolicyOps[Self <: TrustedTypePolicy] (val x: Self) extends AnyVal {
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
    def setCreateHTML(value: String => TrustedHTML): Self = this.set("createHTML", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateScript(value: String => TrustedScript): Self = this.set("createScript", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateScriptURL(value: String => TrustedScriptURL): Self = this.set("createScriptURL", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateURL(value: String => TrustedURL): Self = this.set("createURL", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

