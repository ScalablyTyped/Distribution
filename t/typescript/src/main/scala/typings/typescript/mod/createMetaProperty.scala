package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createMetaProperty")
@js.native
object createMetaProperty extends js.Object {
  def apply(keywordToken: ImportKeyword, name: Identifier): MetaProperty = js.native
  def apply(keywordToken: NewKeyword, name: Identifier): MetaProperty = js.native
}

