package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// collection(name: string): Collection
@js.native
trait Command extends js.Object {
  // aggregate: AggregationOperators
  var aggregate: js.Any = js.native
  def and(commands: Command*): Command = js.native
  def and(command: Command): Command = js.native
  def eq(value: js.Any): Command = js.native
  def geoIntersects(options: GeoIntersectsOptions): Command = js.native
  def geoNear(options: GeoNearOptions): Command = js.native
  def geoWithin(options: GeoWithinOptions): Command = js.native
  def gt(value: Double): Command = js.native
  def gte(value: Double): Command = js.native
  def in(values: js.Array[_]): Command = js.native
  def inc(value: Double): Command = js.native
  def lt(value: Double): Command = js.native
  def lte(value: Double): Command = js.native
  def mul(value: Double): Command = js.native
  def neq(value: js.Any): Command = js.native
  def nin(values: js.Array[_]): Command = js.native
  def or(command: js.Array[CrosFieldCommand]): Command = js.native
  def or(commands: Command*): Command = js.native
  def or(command: Command): Command = js.native
  def pop(): Command = js.native
  def push(values: js.Array[_]): Command = js.native
  def remove(): Command = js.native
  def set(value: js.Any): Command = js.native
  def shift(): Command = js.native
  def unshift(values: js.Array[_]): Command = js.native
}

