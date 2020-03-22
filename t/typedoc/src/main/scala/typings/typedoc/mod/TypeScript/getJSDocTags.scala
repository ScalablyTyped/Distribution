package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocTags")
@js.native
object getJSDocTags extends js.Object {
  /** Get all JSDoc tags related to a node, including those on parent nodes. */
  def apply(node: Node): js.Array[JSDocTag] = js.native
}

