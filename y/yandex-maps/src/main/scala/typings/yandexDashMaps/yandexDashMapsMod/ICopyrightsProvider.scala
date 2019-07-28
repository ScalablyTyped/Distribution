package typings.yandexDashMaps.yandexDashMapsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyrightsProvider extends IEventEmitter {
  def getCopyrights(coords: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
  def remove(): Unit = js.native
  def setCopyrights(copyrights: String): Unit = js.native
  def setCopyrights(copyrights: js.Array[String | HTMLElement]): Unit = js.native
  def setCopyrights(copyrights: HTMLElement): Unit = js.native
}

