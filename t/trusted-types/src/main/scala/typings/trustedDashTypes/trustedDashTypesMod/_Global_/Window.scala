package typings.trustedDashTypes.trustedDashTypesMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var TrustedHTML: typings.trustedDashTypes.trustedDashTypesMod._Global_.TrustedHTML
  var TrustedScript: typings.trustedDashTypes.trustedDashTypesMod._Global_.TrustedScript
  var TrustedScriptURL: typings.trustedDashTypes.trustedDashTypesMod._Global_.TrustedScriptURL
  var TrustedTypePolicy: typings.trustedDashTypes.trustedDashTypesMod._Global_.TrustedTypePolicy
  var TrustedTypePolicyFactory: typings.trustedDashTypes.trustedDashTypesMod._Global_.TrustedTypePolicyFactory
  /** @deprecated Prefer the lowercase version. */
  var TrustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.undefined
  var TrustedURL: typings.trustedDashTypes.trustedDashTypesMod._Global_.TrustedURL
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
    val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML.asInstanceOf[js.Any], TrustedScript = TrustedScript.asInstanceOf[js.Any], TrustedScriptURL = TrustedScriptURL.asInstanceOf[js.Any], TrustedTypePolicy = TrustedTypePolicy.asInstanceOf[js.Any], TrustedTypePolicyFactory = TrustedTypePolicyFactory.asInstanceOf[js.Any], TrustedURL = TrustedURL.asInstanceOf[js.Any])
    if (TrustedTypes != null) __obj.updateDynamic("TrustedTypes")(TrustedTypes.asInstanceOf[js.Any])
    if (trustedTypes != null) __obj.updateDynamic("trustedTypes")(trustedTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

