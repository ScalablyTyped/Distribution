package typings
package vegaDashLiteLib.buildSrcLogicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/logical", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forEachLeaf[T](op: LogicalOperand[T], fn: js.Function1[/* op */ T, scala.Unit]): scala.Unit = js.native
  def isLogicalAnd(op: LogicalOperand[_]): /* is vega-lite.vega-lite/build/src/logical.LogicalAnd<any> */ scala.Boolean = js.native
  def isLogicalNot(op: LogicalOperand[_]): /* is vega-lite.vega-lite/build/src/logical.LogicalNot<any> */ scala.Boolean = js.native
  def isLogicalOr(op: LogicalOperand[_]): /* is vega-lite.vega-lite/build/src/logical.LogicalOr<any> */ scala.Boolean = js.native
  def normalizeLogicalOperand[T](op: LogicalOperand[T], normalizer: js.Function1[/* o */ T, T]): LogicalOperand[T] = js.native
}

