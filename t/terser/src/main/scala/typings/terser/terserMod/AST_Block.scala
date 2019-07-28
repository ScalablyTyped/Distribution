package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Block extends AST_Node {
  var block_scope: AST_Scope | Null = js.native
  var body: js.Array[AST_Node] = js.native
}

