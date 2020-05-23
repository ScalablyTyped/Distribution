package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocImplementsTag
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocImplementsTags")
@js.native
object getJSDocImplementsTags extends js.Object {
  /** Gets the JSDoc implements tags for the node if present */
  def apply(node: Node): js.Array[JSDocImplementsTag] = js.native
}

