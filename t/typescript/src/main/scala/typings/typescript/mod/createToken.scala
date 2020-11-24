package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createToken")
@js.native
object createToken extends js.Object {
  
  /** @deprecated Use `factory.createToken` or the factory supplied by your transformation context instead. */
  def apply[TKind /* <: SyntaxKind */](kind: TKind): Token[TKind] = js.native
}
