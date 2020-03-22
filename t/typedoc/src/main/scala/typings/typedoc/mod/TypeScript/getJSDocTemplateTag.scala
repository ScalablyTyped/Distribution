package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocTemplateTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocTemplateTag")
@js.native
object getJSDocTemplateTag extends js.Object {
  /** Gets the JSDoc template tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocTemplateTag] = js.native
}

