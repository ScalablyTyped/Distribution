package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.MetaProperty
import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createMetaProperty")
@js.native
object createMetaProperty extends js.Object {
  
  /** @deprecated Use `factory.createMetaProperty` or the factory supplied by your transformation context instead. */
  def apply(keywordToken: ImportKeyword, name: Identifier): MetaProperty = js.native
  def apply(keywordToken: NewKeyword, name: Identifier): MetaProperty = js.native
}
