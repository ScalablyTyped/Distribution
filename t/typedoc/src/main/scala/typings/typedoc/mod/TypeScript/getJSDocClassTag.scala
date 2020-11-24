package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocClassTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocClassTag")
@js.native
object getJSDocClassTag extends js.Object {
  
  /** Gets the JSDoc class tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocClassTag] = js.native
}
