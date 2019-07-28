package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeWalker")
@js.native
class TreeWalker protected () extends js.Object {
  def this(callback: js.Function2[
        /* node */ AST_Node, 
        /* descend */ js.UndefOr[js.Function1[/* node */ AST_Node, Unit]], 
        js.UndefOr[Boolean]
      ]) = this()
  var directives: js.Object = js.native
  var stack: js.Array[AST_Node] = js.native
  def find_parent(`type`: AST_Node): js.UndefOr[AST_Node] = js.native
  def has_directive(`type`: String): Boolean = js.native
  def loopcontrol_target(node: AST_Node): js.UndefOr[AST_Node] = js.native
  def parent(n: Double): js.UndefOr[AST_Node] = js.native
  def pop(): Unit = js.native
  def push(node: AST_Node): Unit = js.native
  def self(): js.UndefOr[AST_Node] = js.native
  def visit(node: AST_Node, descend: Boolean): js.Any = js.native
}

