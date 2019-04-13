package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDoc extends Node {
  var comment: js.UndefOr[java.lang.String] = js.native
  @JSName("parent")
  var parent_JSDoc: HasJSDoc = js.native
  var tags: js.UndefOr[NodeArray[JSDocTag]] = js.native
}

