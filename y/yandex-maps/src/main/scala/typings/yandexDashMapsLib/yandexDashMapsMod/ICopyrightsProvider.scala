package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyrightsProvider extends IEventEmitter {
  def getCopyrights(coords: js.Array[scala.Double], zoom: scala.Double): js.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
  def remove(): scala.Unit = js.native
  def setCopyrights(copyrights: java.lang.String): scala.Unit = js.native
  def setCopyrights(copyrights: js.Array[java.lang.String | stdLib.HTMLElement]): scala.Unit = js.native
  def setCopyrights(copyrights: stdLib.HTMLElement): scala.Unit = js.native
}

