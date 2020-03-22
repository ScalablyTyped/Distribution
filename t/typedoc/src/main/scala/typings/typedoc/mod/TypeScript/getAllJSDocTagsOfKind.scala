package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getAllJSDocTagsOfKind")
@js.native
object getAllJSDocTagsOfKind extends js.Object {
  /** Gets all JSDoc tags of a specified kind, or undefined if not present. */
  def apply(node: Node, kind: typings.typescript.mod.SyntaxKind): js.Array[JSDocTag] = js.native
}

