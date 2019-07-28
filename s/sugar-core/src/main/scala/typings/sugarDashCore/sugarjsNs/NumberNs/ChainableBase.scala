package typings.sugarDashCore.sugarjsNs.NumberNs

import typings.std.IntlNs.NumberFormatOptions
import typings.sugarDashCore.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def toExponential(): SugarDefaultChainable[String] = js.native
  def toExponential(fractionDigits: Double): SugarDefaultChainable[String] = js.native
  def toFixed(): SugarDefaultChainable[String] = js.native
  def toFixed(fractionDigits: Double): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String, options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: js.Array[String], options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
  def toPrecision(): SugarDefaultChainable[String] = js.native
  def toPrecision(precision: Double): SugarDefaultChainable[String] = js.native
}

