package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocPrivateTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocPrivateTag")
@js.native
object getJSDocPrivateTag extends js.Object {
  
  /** Gets the JSDoc private tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocPrivateTag] = js.native
}
