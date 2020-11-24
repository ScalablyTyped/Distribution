package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocPublicTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocPublicTag")
@js.native
object getJSDocPublicTag extends js.Object {
  
  /** Gets the JSDoc public tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocPublicTag] = js.native
}
