package typings.terser.terserMod

import typings.std.Record
import typings.terser.TypeofClassAST_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "AST_Node")
@js.native
class AST_Node () extends js.Object {
  def this(props: js.Object) = this()
  var CTOR: TypeofClassAST_Node = js.native
  var TYPE: String = js.native
  def print_to_string(): String = js.native
  def print_to_string(options: OutputOptions): String = js.native
  def transform(tt: TreeTransformer): AST_Node = js.native
  def transform(tt: TreeTransformer, in_list: Boolean): AST_Node = js.native
  def walk(visitor: TreeWalker): Unit = js.native
}

/* static members */
@JSImport("terser", "AST_Node")
@js.native
object AST_Node extends js.Object {
  var BASE: js.UndefOr[AST_Node] = js.native
  var PROPS: js.Array[String] = js.native
  var SELF_PROPS: js.Array[String] = js.native
  var SUBCLASSES: js.Array[AST_Node] = js.native
  var documentation: String = js.native
  var expressions: js.UndefOr[js.Array[AST_Node]] = js.native
  var from_mozilla_ast: js.UndefOr[js.Function1[/* node */ AST_Node, _]] = js.native
  var propdoc: js.UndefOr[Record[String, String]] = js.native
  var warn: js.UndefOr[js.Function2[/* text */ String, /* props */ js.Any, Unit]] = js.native
}

