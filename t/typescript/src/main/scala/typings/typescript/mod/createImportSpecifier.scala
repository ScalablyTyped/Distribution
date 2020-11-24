package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createImportSpecifier")
@js.native
object createImportSpecifier extends js.Object {
  
  def apply(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  /** @deprecated Use `factory.createImportSpecifier` or the factory supplied by your transformation context instead. */
  def apply(propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
}
