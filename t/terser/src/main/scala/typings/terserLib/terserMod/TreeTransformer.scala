package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeTransformer")
@js.native
class TreeTransformer protected () extends TreeWalker {
  def this(before: js.Function3[
      /* node */ AST_Node, 
      /* descend */ js.UndefOr[js.Function2[/* node */ AST_Node, /* tw */ TreeWalker, scala.Unit]], 
      /* in_list */ js.UndefOr[scala.Boolean], 
      js.UndefOr[AST_Node]
    ]) = this()
  def this(before: js.Function3[
      /* node */ AST_Node, 
      /* descend */ js.UndefOr[js.Function2[/* node */ AST_Node, /* tw */ TreeWalker, scala.Unit]], 
      /* in_list */ js.UndefOr[scala.Boolean], 
      js.UndefOr[AST_Node]
    ], after: js.Function2[/* node */ AST_Node, /* in_list */ js.UndefOr[scala.Boolean], js.UndefOr[AST_Node]]) = this()
  var after: js.UndefOr[js.Function1[/* node */ AST_Node, AST_Node]] = js.native
  def before(node: AST_Node): AST_Node = js.native
}

