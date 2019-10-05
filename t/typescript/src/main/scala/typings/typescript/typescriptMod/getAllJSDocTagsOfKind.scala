package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getAllJSDocTagsOfKind")
@js.native
object getAllJSDocTagsOfKind extends js.Object {
  /** Gets all JSDoc tags of a specified kind, or undefined if not present. */
  def apply(node: Node, kind: SyntaxKind): js.Array[JSDocTag] = js.native
}

