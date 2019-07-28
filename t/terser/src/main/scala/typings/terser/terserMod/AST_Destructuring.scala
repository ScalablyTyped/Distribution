package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Destructuring
  extends AST_Node
     with _ArgType {
  var is_array: Boolean = js.native
  var names: js.Array[AST_Node] = js.native
}

