package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateImportSpecifier")
@js.native
object updateImportSpecifier extends js.Object {
  
  def apply(node: ImportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  /** @deprecated Use `factory.updateImportSpecifier` or the factory supplied by your transformation context instead. */
  def apply(node: ImportSpecifier, propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
}
