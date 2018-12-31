package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionContext extends js.Object {
  /**
    * An array of diagnostics known on the client side overlapping the range provided to the
    * `textDocument/codeAction` request. They are provied so that the server knows which
    * errors are currently presented to the user for the given range. There is no guarantee
    * that these accurately reflect the error state of the resource. The primary parameter
    * to compute code actions is the provided range.
    */
  var diagnostics: js.Array[Diagnostic]
  /**
    * Requested kind of actions to return.
    *
    * Actions not of this kind are filtered out by the client before being shown. So servers
    * can omit computing them.
    */
  var only: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}

