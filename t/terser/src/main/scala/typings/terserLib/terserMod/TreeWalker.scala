package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeWalker")
@js.native
class TreeWalker protected () extends js.Object {
  def this(callback: js.Function2[
      /* node */ AST_Node, 
      /* descend */ js.UndefOr[js.Function1[/* node */ AST_Node, scala.Unit]], 
      js.UndefOr[scala.Boolean]
    ]) = this()
  var directives: js.Object = js.native
  var stack: js.Array[AST_Node] = js.native
  def find_parent(`type`: AST_Node): js.UndefOr[AST_Node] = js.native
  def has_directive(`type`: java.lang.String): scala.Boolean = js.native
  def loopcontrol_target(node: AST_Node): js.UndefOr[AST_Node] = js.native
  def parent(n: scala.Double): js.UndefOr[AST_Node] = js.native
  def pop(): scala.Unit = js.native
  def push(node: AST_Node): scala.Unit = js.native
  def self(): js.UndefOr[AST_Node] = js.native
  def visit(node: AST_Node, descend: scala.Boolean): js.Any = js.native
}

