package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocDeprecatedTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocDeprecatedTag")
@js.native
object getJSDocDeprecatedTag extends js.Object {
  
  /** Gets the JSDoc deprecated tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocDeprecatedTag] = js.native
}
