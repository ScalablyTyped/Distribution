package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "AST_Node")
@js.native
class AST_Node () extends js.Object {
  def this(props: js.Object) = this()
  var CTOR: terserLib.Anon_BASE = js.native
  var TYPE: java.lang.String = js.native
  def print_to_string(): java.lang.String = js.native
  def print_to_string(options: OutputOptions): java.lang.String = js.native
  def transform(tt: TreeTransformer): AST_Node = js.native
  def transform(tt: TreeTransformer, in_list: scala.Boolean): AST_Node = js.native
  def walk(visitor: TreeWalker): scala.Unit = js.native
}

/* static members */
@JSImport("terser", "AST_Node")
@js.native
object AST_Node extends js.Object {
  var BASE: js.UndefOr[terserLib.terserMod.AST_Node] = js.native
  var PROPS: js.Array[java.lang.String] = js.native
  var SELF_PROPS: js.Array[java.lang.String] = js.native
  var SUBCLASSES: js.Array[terserLib.terserMod.AST_Node] = js.native
  var documentation: java.lang.String = js.native
  var expressions: js.UndefOr[js.Array[terserLib.terserMod.AST_Node]] = js.native
  var from_mozilla_ast: js.UndefOr[js.Function1[/* node */ terserLib.terserMod.AST_Node, _]] = js.native
  var propdoc: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.native
  var warn: js.UndefOr[js.Function2[/* text */ java.lang.String, /* props */ js.Any, scala.Unit]] = js.native
}

