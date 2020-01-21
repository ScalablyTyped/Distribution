package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeTransformer")
@js.native
class TreeTransformer protected () extends TreeWalker {
  def this(before: js.Function3[
        /* node */ ASTNode, 
        /* descend */ js.UndefOr[js.Function2[/* node */ ASTNode, /* tw */ TreeWalker, Unit]], 
        /* in_list */ js.UndefOr[Boolean], 
        js.UndefOr[ASTNode]
      ]) = this()
  def this(
    before: js.Function3[
        /* node */ ASTNode, 
        /* descend */ js.UndefOr[js.Function2[/* node */ ASTNode, /* tw */ TreeWalker, Unit]], 
        /* in_list */ js.UndefOr[Boolean], 
        js.UndefOr[ASTNode]
      ],
    after: js.Function2[/* node */ ASTNode, /* in_list */ js.UndefOr[Boolean], js.UndefOr[ASTNode]]
  ) = this()
  var after: js.UndefOr[js.Function1[/* node */ ASTNode, ASTNode]] = js.native
  def before(node: ASTNode): ASTNode = js.native
}

