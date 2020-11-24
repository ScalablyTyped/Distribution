package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.SourceMapRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getTokenSourceMapRange")
@js.native
object getTokenSourceMapRange extends js.Object {
  
  /**
    * Gets the TextRange to use for source maps for a token of a node.
    */
  def apply(node: Node, token: typings.typescript.mod.SyntaxKind): js.UndefOr[SourceMapRange] = js.native
}
