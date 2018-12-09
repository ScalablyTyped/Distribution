package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.control.Manager")
@js.native
class Manager protected () extends js.Object {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def this(map: yandexDashMapsLib.ymapsNs.Map, controls: js.Array[java.lang.String | yandexDashMapsLib.ymapsNs.IControl]) = this()
  def this(map: yandexDashMapsLib.ymapsNs.Map, controls: js.Array[java.lang.String | yandexDashMapsLib.ymapsNs.IControl], options: IManagerOptions) = this()
  var events: yandexDashMapsLib.ymapsNs.eventNs.Manager = js.native
  var options: yandexDashMapsLib.ymapsNs.optionNs.Manager = js.native
  var state: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def add(control: yandexDashMapsLib.ymapsNs.ControlKey): this.type = js.native
  def add(control: yandexDashMapsLib.ymapsNs.ControlKey, options: IManagerControlOptions): this.type = js.native
  def add(control: yandexDashMapsLib.ymapsNs.IControl): this.type = js.native
  def add(control: yandexDashMapsLib.ymapsNs.IControl, options: IManagerControlOptions): this.type = js.native
  def each(
    callback: js.Function1[/* control */ yandexDashMapsLib.ymapsNs.IControl, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def get(index: java.lang.String): yandexDashMapsLib.ymapsNs.IControl | scala.Null = js.native
  def get(index: scala.Double): yandexDashMapsLib.ymapsNs.IControl | scala.Null = js.native
  def getChildElement(control: yandexDashMapsLib.ymapsNs.IControl): js.Promise[stdLib.HTMLElement] = js.native
  def getContainer(): stdLib.HTMLElement = js.native
  def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def indexOf(childToFind: java.lang.String): scala.Double = js.native
  def indexOf(childToFind: yandexDashMapsLib.ymapsNs.IControl): scala.Double = js.native
  def remove(control: java.lang.String): this.type = js.native
  def remove(control: yandexDashMapsLib.ymapsNs.IControl): this.type = js.native
}

