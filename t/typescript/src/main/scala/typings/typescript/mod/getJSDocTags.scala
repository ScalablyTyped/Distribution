package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getJSDocTags")
@js.native
object getJSDocTags extends js.Object {
  /** Get all JSDoc tags related to a node, including those on parent nodes. */
  def apply(node: Node): js.Array[JSDocTag] = js.native
}

