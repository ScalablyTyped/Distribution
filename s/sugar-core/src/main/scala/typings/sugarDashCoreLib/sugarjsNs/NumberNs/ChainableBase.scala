package typings
package sugarDashCoreLib.sugarjsNs.NumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def toExponential(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toExponential(fractionDigits: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toFixed(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toFixed(fractionDigits: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: js.Array[java.lang.String]): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toPrecision(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toPrecision(precision: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
}

