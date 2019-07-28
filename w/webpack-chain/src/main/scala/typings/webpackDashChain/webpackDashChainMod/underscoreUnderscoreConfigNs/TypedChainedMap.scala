package typings.webpackDashChain.webpackDashChainMod.underscoreUnderscoreConfigNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedChainedMap[Parent, Value]
  extends typings.webpackDashChain.webpackDashChainMod.underscoreUnderscoreConfigNs.Chained[Parent] {
  def clear(): this.type = js.native
  def delete(key: String): this.type = js.native
  def entries(): StringDictionary[Value] = js.native
  def get(key: String): Value = js.native
  def has(key: String): Boolean = js.native
  def merge(obj: StringDictionary[Value]): this.type = js.native
  def set(key: String, value: Value): this.type = js.native
  def values(): js.Array[Value] = js.native
  def when(condition: Boolean, trueBrancher: js.Function1[/* obj */ this.type, Unit]): this.type = js.native
  def when(
    condition: Boolean,
    trueBrancher: js.Function1[/* obj */ this.type, Unit],
    falseBrancher: js.Function1[/* obj */ this.type, Unit]
  ): this.type = js.native
}

