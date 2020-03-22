package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocReturnTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocReturnTag")
@js.native
object getJSDocReturnTag extends js.Object {
  /** Gets the JSDoc return tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocReturnTag] = js.native
}

