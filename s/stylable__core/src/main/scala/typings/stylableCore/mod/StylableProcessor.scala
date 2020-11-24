package typings.stylableCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "StylableProcessor")
@js.native
class StylableProcessor ()
  extends typings.stylableCore.stylableProcessorMod.StylableProcessor {
  def this(diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics) = this()
  def this(
    diagnostics: js.UndefOr[scala.Nothing],
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ) = this()
  def this(
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ) = this()
}
