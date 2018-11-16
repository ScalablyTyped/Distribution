package typings
package yandexDashMapsLib.ymapsNs.mapNs.paneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.map.pane.Manager")
@js.native
class Manager protected () extends js.Object {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def append(key: java.lang.String, pane: yandexDashMapsLib.ymapsNs.IPane): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def get(key: java.lang.String): yandexDashMapsLib.ymapsNs.IPane | scala.Null = js.native
  def getLower(): java.lang.String = js.native
  def getUpper(): java.lang.String = js.native
  def insertBefore(key: java.lang.String, pane: yandexDashMapsLib.ymapsNs.IPane, referenceKey: java.lang.String): scala.Unit = js.native
  def remove(pane: yandexDashMapsLib.ymapsNs.IPane): scala.Unit = js.native
}

