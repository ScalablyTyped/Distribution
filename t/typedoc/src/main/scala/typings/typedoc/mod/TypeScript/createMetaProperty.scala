package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.MetaProperty
import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createMetaProperty")
@js.native
object createMetaProperty extends js.Object {
  def apply(keywordToken: ImportKeyword, name: Identifier): MetaProperty = js.native
  def apply(keywordToken: NewKeyword, name: Identifier): MetaProperty = js.native
}

