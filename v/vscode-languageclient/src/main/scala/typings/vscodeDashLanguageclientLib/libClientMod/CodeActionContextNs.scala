package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeActionContext")
@js.native
object CodeActionContextNs extends js.Object {
  /**
       * Creates a new CodeActionContext literal.
       */
  def create(
    diagnostics: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  /**
       * Creates a new CodeActionContext literal.
       */
  def create(
    diagnostics: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
    ],
    only: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  /**
       * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
       */
  def is(value: js.Any): /* is CodeActionContext */scala.Boolean = js.native
}

