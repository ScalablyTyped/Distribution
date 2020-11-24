package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createImportSpecifier")
@js.native
object createImportSpecifier extends js.Object {
  
  def apply(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  /** @deprecated Use `factory.createImportSpecifier` or the factory supplied by your transformation context instead. */
  def apply(propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
}
