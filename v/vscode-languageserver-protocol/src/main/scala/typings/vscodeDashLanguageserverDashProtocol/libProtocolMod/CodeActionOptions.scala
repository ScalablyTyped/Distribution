package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionOptions extends js.Object {
  /**
    * CodeActionKinds that this server may return.
    *
    * The list of kinds may be generic, such as `CodeActionKind.Refactor`, or the server
    * may list out every specific kind they provide.
    */
  var codeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}

object CodeActionOptions {
  @scala.inline
  def apply(codeActionKinds: js.Array[CodeActionKind] = null): CodeActionOptions = {
    val __obj = js.Dynamic.literal()
    if (codeActionKinds != null) __obj.updateDynamic("codeActionKinds")(codeActionKinds)
    __obj.asInstanceOf[CodeActionOptions]
  }
}

