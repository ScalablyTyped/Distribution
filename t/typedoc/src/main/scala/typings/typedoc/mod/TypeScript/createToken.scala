package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createToken")
@js.native
object createToken extends js.Object {
  def apply[TKind /* <: typings.typescript.mod.SyntaxKind */](token: TKind): Token[TKind] = js.native
}

