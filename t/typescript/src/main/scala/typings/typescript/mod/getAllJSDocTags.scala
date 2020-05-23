package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getAllJSDocTags")
@js.native
object getAllJSDocTags extends js.Object {
  /** Gets all JSDoc tags that match a specified predicate */
  def apply[T /* <: JSDocTag */](node: Node, predicate: js.Function1[/* tag */ JSDocTag, /* is T */ Boolean]): js.Array[T] = js.native
}

