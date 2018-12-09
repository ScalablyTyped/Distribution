package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupManager[T] extends IEventEmitter {
  def close(): js.Promise[T] = js.native
  def close(force: scala.Boolean): js.Promise[T] = js.native
  def destroy(): scala.Unit = js.native
  def getData(): js.Object | scala.Null = js.native
  def getOptions(): IOptionManager | scala.Null = js.native
  def getOverlay(): js.Promise[IOverlay | scala.Null] = js.native
  def getOverlaySync(): IOverlay | scala.Null = js.native
  def getPosition(): js.Array[scala.Double] | scala.Null = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double]): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: java.lang.String): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: java.lang.String, options: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: js.Object, options: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: stdLib.HTMLElement): js.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: stdLib.HTMLElement, options: js.Object): js.Promise[T] = js.native
  def setData(data: java.lang.String): js.Promise[T] = js.native
  def setData(data: js.Object): js.Promise[T] = js.native
  def setData(data: stdLib.HTMLElement): js.Promise[T] = js.native
  def setOptions(options: js.Object): js.Promise[T] = js.native
  def setPosition(position: js.Array[scala.Double]): js.Promise[T] = js.native
}

