package typings.yandexMaps.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopup[T] extends ICustomizable {
  def close(): js.Promise[T] = js.native
  def close(force: Boolean): js.Promise[T] = js.native
  def getData(): js.Object = js.native
  def getOverlay(): js.Promise[IOverlay] = js.native
  def getOverlaySync(): IOverlay = js.native
  def getPosition(): js.Array[Double] = js.native
  def isOpen(): Boolean = js.native
  def open(position: js.Array[Double], data: String): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: HTMLElement): js.Promise[T] = js.native
  def setData(data: String): js.Promise[T] = js.native
  def setData(data: js.Object): js.Promise[T] = js.native
  def setData(data: HTMLElement): js.Promise[T] = js.native
  def setPosition(position: js.Array[Double]): js.Promise[T] = js.native
}

