package typings.typedoc.mod.TypeScript

import typings.typescript.mod.KeywordTypeNode
import typings.typescript.mod.KeywordTypeSyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createKeywordTypeNode")
@js.native
object createKeywordTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createKeywordTypeNode` or the factory supplied by your transformation context instead. */
  def apply[TKind /* <: KeywordTypeSyntaxKind */](kind: TKind): KeywordTypeNode[TKind] = js.native
}
