package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createToken")
@js.native
object createToken extends js.Object {
  
  /** @deprecated Use `factory.createToken` or the factory supplied by your transformation context instead. */
  def apply[TKind /* <: typings.typescript.mod.SyntaxKind */](kind: TKind): Token[TKind] = js.native
}
