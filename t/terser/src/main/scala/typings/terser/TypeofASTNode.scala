package typings.terser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import typings.terser.mod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofASTNode
  extends Instantiable0[ASTNode]
     with Instantiable1[/* props */ js.Object, ASTNode] {
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

