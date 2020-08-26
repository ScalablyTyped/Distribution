package typings.trustedTypes.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var TrustedHTML: typings.trustedTypes.mod.global.TrustedHTML = js.native
  var TrustedScript: typings.trustedTypes.mod.global.TrustedScript = js.native
  var TrustedScriptURL: typings.trustedTypes.mod.global.TrustedScriptURL = js.native
  var TrustedTypePolicy: typings.trustedTypes.mod.global.TrustedTypePolicy = js.native
  var TrustedTypePolicyFactory: typings.trustedTypes.mod.global.TrustedTypePolicyFactory = js.native
  /** @deprecated Prefer the lowercase version. */
  var TrustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.native
  var TrustedURL: typings.trustedTypes.mod.global.TrustedURL = js.native
  // NOTE: This is needed while the implementation in Chrome still relies
  // on the old uppercase name, either of the values below could be
  // undefined.
  // See https://github.com/w3c/webappsec-trusted-types/issues/177
  var trustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.native
}

object Window {
  @scala.inline
  def apply(
    TrustedHTML: TrustedHTML,
    TrustedScript: TrustedScript,
    TrustedScriptURL: TrustedScriptURL,
    TrustedTypePolicy: TrustedTypePolicy,
    TrustedTypePolicyFactory: TrustedTypePolicyFactory,
    TrustedURL: TrustedURL
  ): Window = {
    val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML.asInstanceOf[js.Any], TrustedScript = TrustedScript.asInstanceOf[js.Any], TrustedScriptURL = TrustedScriptURL.asInstanceOf[js.Any], TrustedTypePolicy = TrustedTypePolicy.asInstanceOf[js.Any], TrustedTypePolicyFactory = TrustedTypePolicyFactory.asInstanceOf[js.Any], TrustedURL = TrustedURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setTrustedHTML(value: TrustedHTML): Self = this.set("TrustedHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedScript(value: TrustedScript): Self = this.set("TrustedScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedScriptURL(value: TrustedScriptURL): Self = this.set("TrustedScriptURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedTypePolicy(value: TrustedTypePolicy): Self = this.set("TrustedTypePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedTypePolicyFactory(value: TrustedTypePolicyFactory): Self = this.set("TrustedTypePolicyFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedURL(value: TrustedURL): Self = this.set("TrustedURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedTypes(value: TrustedTypePolicyFactory): Self = this.set("TrustedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedTypes: Self = this.set("TrustedTypes", js.undefined)
  }
  
}

