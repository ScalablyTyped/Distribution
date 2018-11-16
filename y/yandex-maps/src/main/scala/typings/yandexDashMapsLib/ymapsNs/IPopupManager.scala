package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupManager[T] extends IEventEmitter {
  def close(): stdLib.Promise[T] = js.native
  def close(force: scala.Boolean): stdLib.Promise[T] = js.native
  def destroy(): scala.Unit = js.native
  def getData(): js.Object | scala.Null = js.native
  def getOptions(): IOptionManager | scala.Null = js.native
  def getOverlay(): stdLib.Promise[IOverlay | scala.Null] = js.native
  def getOverlaySync(): IOverlay | scala.Null = js.native
  def getPosition(): js.Array[scala.Double] | scala.Null = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double]): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: java.lang.String): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: java.lang.String, options: js.Object): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: js.Object): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: js.Object, options: js.Object): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: stdLib.HTMLElement): stdLib.Promise[T] = js.native
  def open(position: js.Array[scala.Double], data: stdLib.HTMLElement, options: js.Object): stdLib.Promise[T] = js.native
  def setData(data: java.lang.String): stdLib.Promise[T] = js.native
  def setData(data: js.Object): stdLib.Promise[T] = js.native
  def setData(data: stdLib.HTMLElement): stdLib.Promise[T] = js.native
  def setOptions(options: js.Object): stdLib.Promise[T] = js.native
  def setPosition(position: js.Array[scala.Double]): stdLib.Promise[T] = js.native
}

