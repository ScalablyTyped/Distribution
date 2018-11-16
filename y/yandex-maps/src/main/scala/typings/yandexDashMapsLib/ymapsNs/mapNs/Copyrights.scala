package typings
package yandexDashMapsLib.ymapsNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.map.Copyrights")
@js.native
class Copyrights protected () extends js.Object {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def add(customCopyrights: java.lang.String): yandexDashMapsLib.ymapsNs.ICopyrightsAccessor = js.native
  def add(customCopyrights: js.Array[java.lang.String | stdLib.HTMLElement]): yandexDashMapsLib.ymapsNs.ICopyrightsAccessor = js.native
  def add(customCopyrights: stdLib.HTMLElement): yandexDashMapsLib.ymapsNs.ICopyrightsAccessor = js.native
  def addProvider(provider: yandexDashMapsLib.ymapsNs.ICopyrightsProvider): this.type = js.native
  def get(): stdLib.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
  def get(point: js.Array[scala.Double]): stdLib.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
  def get(point: js.Array[scala.Double], zoom: scala.Double): stdLib.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
  def getPromoLink(): java.lang.String = js.native
  def removeProvider(provider: yandexDashMapsLib.ymapsNs.ICopyrightsProvider): this.type = js.native
}

