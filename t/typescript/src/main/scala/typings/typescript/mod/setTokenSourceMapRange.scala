package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "setTokenSourceMapRange")
@js.native
object setTokenSourceMapRange extends js.Object {
  def apply[T /* <: Node */](node: T, token: SyntaxKind): T = js.native
  /**
    * Sets the TextRange to use for source maps for a token of a node.
    */
  def apply[T /* <: Node */](node: T, token: SyntaxKind, range: SourceMapRange): T = js.native
}

