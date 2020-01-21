package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeWalker")
@js.native
class TreeWalker protected () extends js.Object {
  def this(callback: js.Function2[
        /* node */ ASTNode, 
        /* descend */ js.UndefOr[js.Function1[/* node */ ASTNode, Unit]], 
        js.UndefOr[Boolean]
      ]) = this()
  var directives: js.Object = js.native
  var stack: js.Array[ASTNode] = js.native
  def find_parent(`type`: ASTNode): js.UndefOr[ASTNode] = js.native
  def has_directive(`type`: String): Boolean = js.native
  def loopcontrol_target(node: ASTNode): js.UndefOr[ASTNode] = js.native
  def parent(n: Double): js.UndefOr[ASTNode] = js.native
  def pop(): Unit = js.native
  def push(node: ASTNode): Unit = js.native
  def self(): js.UndefOr[ASTNode] = js.native
  def visit(node: ASTNode, descend: Boolean): js.Any = js.native
}

