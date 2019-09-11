package typings.trustedDashTypes.trustedDashTypesMod.Global

import typings.trustedDashTypes.trustedDashTypesMod.TrustedHTML
import typings.trustedDashTypes.trustedDashTypesMod.TrustedScript
import typings.trustedDashTypes.trustedDashTypesMod.TrustedScriptURL
import typings.trustedDashTypes.trustedDashTypesMod.TrustedTypePolicyFactory
import typings.trustedDashTypes.trustedDashTypesMod.TrustedTypePolicyOptions
import typings.trustedDashTypes.trustedDashTypesMod.TrustedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var TrustedHTML: typings.trustedDashTypes.trustedDashTypesMod.TrustedHTML
  var TrustedScript: typings.trustedDashTypes.trustedDashTypesMod.TrustedScript
  var TrustedScriptURL: typings.trustedDashTypes.trustedDashTypesMod.TrustedScriptURL
  var TrustedTypePolicyFactory: typings.trustedDashTypes.trustedDashTypesMod.TrustedTypePolicyFactory
  var TrustedTypePolicyOptions: typings.trustedDashTypes.trustedDashTypesMod.TrustedTypePolicyOptions
  var TrustedURL: typings.trustedDashTypes.trustedDashTypesMod.TrustedURL
  var trustedTypes: TrustedTypePolicyFactory
}

object Window {
  @scala.inline
  def apply(
    TrustedHTML: TrustedHTML,
    TrustedScript: TrustedScript,
    TrustedScriptURL: TrustedScriptURL,
    TrustedTypePolicyFactory: TrustedTypePolicyFactory,
    TrustedTypePolicyOptions: TrustedTypePolicyOptions,
    TrustedURL: TrustedURL,
    trustedTypes: TrustedTypePolicyFactory
  ): Window = {
    val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML, TrustedScript = TrustedScript, TrustedScriptURL = TrustedScriptURL, TrustedTypePolicyFactory = TrustedTypePolicyFactory, TrustedTypePolicyOptions = TrustedTypePolicyOptions, TrustedURL = TrustedURL, trustedTypes = trustedTypes)
  
    __obj.asInstanceOf[Window]
  }
}

