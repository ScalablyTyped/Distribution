package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getTokenSourceMapRange")
@js.native
object getTokenSourceMapRange extends js.Object {
  /**
    * Gets the TextRange to use for source maps for a token of a node.
    */
  def apply(node: Node, token: SyntaxKind): js.UndefOr[SourceMapRange] = js.native
}

