package typings.terser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import typings.terser.terserMod.AST_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAST_Node
  extends Instantiable0[AST_Node]
     with Instantiable1[/* props */ js.Object, AST_Node] {
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

