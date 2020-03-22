package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocEnumTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocEnumTag")
@js.native
object getJSDocEnumTag extends js.Object {
  /** Gets the JSDoc enum tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocEnumTag] = js.native
}

