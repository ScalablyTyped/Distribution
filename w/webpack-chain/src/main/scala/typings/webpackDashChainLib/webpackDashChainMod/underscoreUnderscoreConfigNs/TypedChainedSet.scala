package typings
package webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedChainedSet[Parent, Value] extends Chained[Parent] {
  def add(value: Value): this.type = js.native
  def clear(): this.type = js.native
  def delete(key: java.lang.String): this.type = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def merge(arr: js.Array[Value]): this.type = js.native
  def prepend(value: Value): this.type = js.native
  def values(): js.Array[Value] = js.native
  def when(condition: scala.Boolean, trueBrancher: js.Function1[/* obj */ this.type, scala.Unit]): this.type = js.native
  def when(
    condition: scala.Boolean,
    trueBrancher: js.Function1[/* obj */ this.type, scala.Unit],
    falseBrancher: js.Function1[/* obj */ this.type, scala.Unit]
  ): this.type = js.native
}

