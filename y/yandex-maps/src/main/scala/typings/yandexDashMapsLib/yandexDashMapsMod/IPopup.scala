package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopup[T] extends ICustomizable {
  def close(): js.Promise[T] = js.native
  def close(force: scala.Boolean): js.Promise[T] = js.native
  def getData(): js.Object = js.native
  def getOverlay(): js.Promise[IOverlay] = js.native
  def getOverlaySync(): IOverlay = js.native
  def getPosition(): js.Array[scala.Double] = js.native
  def isOpen(): scala.Boolean = js.native
  def open(position: js.Array[scala.Double], data: java.lang.String): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: stdLib.HTMLElement): js.Promise[T] = js.native
  def setData(data: java.lang.String): js.Promise[T] = js.native
  def setData(data: js.Object): js.Promise[T] = js.native
  def setData(data: stdLib.HTMLElement): js.Promise[T] = js.native
  def setPosition(position: js.Array[scala.Double]): js.Promise[T] = js.native
}

