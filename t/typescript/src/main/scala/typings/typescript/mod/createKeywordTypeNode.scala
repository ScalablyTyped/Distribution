package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createKeywordTypeNode")
@js.native
object createKeywordTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createKeywordTypeNode` or the factory supplied by your transformation context instead. */
  def apply[TKind /* <: KeywordTypeSyntaxKind */](kind: TKind): KeywordTypeNode[TKind] = js.native
}
