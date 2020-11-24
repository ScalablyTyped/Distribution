package typings.stylableCore.mod

import typings.postcss.mod.Root_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "process")
@js.native
object process extends js.Object {
  
  def apply(root: Root_): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  def apply(
    root: Root_,
    diagnostics: js.UndefOr[scala.Nothing],
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  def apply(root: Root_, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  def apply(
    root: Root_,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
}
