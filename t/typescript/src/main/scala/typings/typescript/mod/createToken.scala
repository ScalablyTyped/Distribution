package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createToken")
@js.native
object createToken extends js.Object {
  def apply[TKind /* <: SyntaxKind */](token: TKind): Token[TKind] = js.native
}

