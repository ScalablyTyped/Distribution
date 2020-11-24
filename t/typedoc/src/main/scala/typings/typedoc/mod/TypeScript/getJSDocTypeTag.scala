package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocTypeTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocTypeTag")
@js.native
object getJSDocTypeTag extends js.Object {
  
  /** Gets the JSDoc type tag for the node if present and valid */
  def apply(node: Node): js.UndefOr[JSDocTypeTag] = js.native
}
