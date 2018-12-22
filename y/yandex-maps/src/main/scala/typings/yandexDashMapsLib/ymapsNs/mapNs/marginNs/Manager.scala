package typings
package yandexDashMapsLib.ymapsNs.mapNs.marginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.map.margin.Manager")
@js.native
class Manager protected () extends js.Object {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def addArea(screenArea: js.Object): Accessor = js.native
  def destroy(): this.type = js.native
  def getMargin(): js.Array[scala.Double] = js.native
  def getOffset(): js.Array[scala.Double] = js.native
  def setDefaultMargin(margin: js.Array[js.Array[scala.Double] | scala.Double]): scala.Unit = js.native
  def setDefaultMargin(margin: scala.Double): scala.Unit = js.native
}

