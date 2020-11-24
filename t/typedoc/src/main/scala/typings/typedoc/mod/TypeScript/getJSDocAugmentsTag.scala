package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocAugmentsTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocAugmentsTag")
@js.native
object getJSDocAugmentsTag extends js.Object {
  
  /** Gets the JSDoc augments tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocAugmentsTag] = js.native
}
