package typings
package webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedChainedMap[Parent, Value] extends Chained[Parent] {
  def clear(): this.type = js.native
  def delete(key: java.lang.String): this.type = js.native
  def entries(): ScalablyTyped.runtime.StringDictionary[Value] = js.native
  def get(key: java.lang.String): Value = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def merge(obj: ScalablyTyped.runtime.StringDictionary[Value]): this.type = js.native
  def set(key: java.lang.String, value: Value): this.type = js.native
  def values(): js.Array[Value] = js.native
  def when(condition: scala.Boolean, trueBrancher: js.Function1[/* obj */ this.type, scala.Unit]): this.type = js.native
  def when(
    condition: scala.Boolean,
    trueBrancher: js.Function1[/* obj */ this.type, scala.Unit],
    falseBrancher: js.Function1[/* obj */ this.type, scala.Unit]
  ): this.type = js.native
}

