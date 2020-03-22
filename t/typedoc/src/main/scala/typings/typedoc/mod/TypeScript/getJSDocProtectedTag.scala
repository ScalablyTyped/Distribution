package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocProtectedTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocProtectedTag")
@js.native
object getJSDocProtectedTag extends js.Object {
  /** Gets the JSDoc protected tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocProtectedTag] = js.native
}

