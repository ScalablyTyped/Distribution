package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createToken")
@js.native
object createToken extends js.Object {
  def apply[TKind /* <: SyntaxKind */](token: TKind): Token[TKind] = js.native
}

