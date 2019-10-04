package typings.trustedDashTypes.trustedDashTypesMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var TrustedHTML: typings.trustedDashTypes.trustedDashTypesMod.Global.TrustedHTML
  var TrustedScript: typings.trustedDashTypes.trustedDashTypesMod.Global.TrustedScript
  var TrustedScriptURL: typings.trustedDashTypes.trustedDashTypesMod.Global.TrustedScriptURL
  var TrustedTypePolicy: typings.trustedDashTypes.trustedDashTypesMod.Global.TrustedTypePolicy
  var TrustedTypePolicyFactory: typings.trustedDashTypes.trustedDashTypesMod.Global.TrustedTypePolicyFactory
  /** @deprecated Prefer the lowercase version. */
  var TrustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.undefined
  var TrustedURL: typings.trustedDashTypes.trustedDashTypesMod.Global.TrustedURL
  // NOTE: This is needed while the implementation in Chrome still relies
  // on the old uppercase name, either of the values below could be
  // undefined.
  // See https://github.com/w3c/webappsec-trusted-types/issues/177
  var trustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    TrustedHTML: TrustedHTML,
    TrustedScript: TrustedScript,
    TrustedScriptURL: TrustedScriptURL,
    TrustedTypePolicy: TrustedTypePolicy,
    TrustedTypePolicyFactory: TrustedTypePolicyFactory,
    TrustedURL: TrustedURL,
    TrustedTypes: TrustedTypePolicyFactory = null,
    trustedTypes: TrustedTypePolicyFactory = null
  ): Window = {
    val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML, TrustedScript = TrustedScript, TrustedScriptURL = TrustedScriptURL, TrustedTypePolicy = TrustedTypePolicy, TrustedTypePolicyFactory = TrustedTypePolicyFactory, TrustedURL = TrustedURL)
    if (TrustedTypes != null) __obj.updateDynamic("TrustedTypes")(TrustedTypes)
    if (trustedTypes != null) __obj.updateDynamic("trustedTypes")(trustedTypes)
    __obj.asInstanceOf[Window]
  }
}

