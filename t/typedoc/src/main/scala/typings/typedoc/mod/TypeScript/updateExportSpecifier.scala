package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ExportSpecifier
import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateExportSpecifier")
@js.native
object updateExportSpecifier extends js.Object {
  
  def apply(node: ExportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  /** @deprecated Use `factory.updateExportSpecifier` or the factory supplied by your transformation context instead. */
  def apply(node: ExportSpecifier, propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
}
