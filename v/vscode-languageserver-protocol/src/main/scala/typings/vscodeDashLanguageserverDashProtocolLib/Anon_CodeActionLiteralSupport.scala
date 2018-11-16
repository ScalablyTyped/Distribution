package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_CodeActionLiteralSupport extends js.Object {
  /**
           * The client support code action literals as a valid
           * response of the `textDocument/codeAction` request.
           */
  var codeActionLiteralSupport: js.UndefOr[Anon_CodeActionKind] = js.undefined
  /**
           * Whether code action supports dynamic registration.
           */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
}

