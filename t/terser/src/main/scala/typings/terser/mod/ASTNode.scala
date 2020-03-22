package typings.terser.mod

import typings.std.Record
import typings.terser.TypeofASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "AST_Node")
@js.native
class ASTNode () extends js.Object {
  def this(props: js.Object) = this()
  var CTOR: TypeofASTNode = js.native
  var TYPE: String = js.native
  def print_to_string(): String = js.native
  def print_to_string(options: OutputOptions): String = js.native
  def transform(tt: TreeTransformer): ASTNode = js.native
  def transform(tt: TreeTransformer, in_list: Boolean): ASTNode = js.native
  def walk(visitor: TreeWalker): Unit = js.native
}

/* static members */
@JSImport("terser", "AST_Node")
@js.native
object ASTNode extends js.Object {
  var BASE: js.UndefOr[ASTNode] = js.native
  var PROPS: js.Array[String] = js.native
  var SELF_PROPS: js.Array[String] = js.native
  var SUBCLASSES: js.Array[ASTNode] = js.native
  var documentation: String = js.native
  var expressions: js.UndefOr[js.Array[ASTNode]] = js.native
  var from_mozilla_ast: js.UndefOr[js.Function1[/* node */ ASTNode, _]] = js.native
  var propdoc: js.UndefOr[Record[String, String]] = js.native
  var warn: js.UndefOr[js.Function2[/* text */ String, /* props */ js.Any, Unit]] = js.native
}

