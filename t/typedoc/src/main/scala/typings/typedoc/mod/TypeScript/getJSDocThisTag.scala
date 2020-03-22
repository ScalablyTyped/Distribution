package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocThisTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocThisTag")
@js.native
object getJSDocThisTag extends js.Object {
  /** Gets the JSDoc this tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocThisTag] = js.native
}

