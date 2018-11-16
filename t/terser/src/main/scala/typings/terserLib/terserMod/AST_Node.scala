package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "AST_Node")
@js.native
class AST_Node () extends js.Object {
  // The last token of this node
  var end: AST_Node = js.native
  var file: js.UndefOr[java.lang.String] = js.native
  var key: js.UndefOr[java.lang.String] = js.native
  var property: js.UndefOr[java.lang.String] = js.native
  // The first token of this node
  var start: AST_Node = js.native
  var value: js.UndefOr[java.lang.String | scala.Double] = js.native
  def transform(tt: TreeTransformer): AST_Toplevel = js.native
  def walk(walker: TreeWalker): scala.Unit = js.native
}

