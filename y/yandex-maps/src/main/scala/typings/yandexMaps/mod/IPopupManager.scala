package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupManager[T]
  extends StObject
     with IEventEmitter {
  
  def close(): js.Promise[T] = js.native
  def close(force: Boolean): js.Promise[T] = js.native
  
  def destroy(): Unit = js.native
  
  def getData(): js.Object | Null = js.native
  
  def getOptions(): IOptionManager | Null = js.native
  
  def getOverlay(): js.Promise[IOverlay | Null] = js.native
  
  def getOverlaySync(): IOverlay | Null = js.native
  
  def getPosition(): js.Array[Double] | Null = js.native
  
  def isOpen(): Boolean = js.native
  
  def open(): js.Promise[T] = js.native
  def open(position: js.Array[Double]): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: String): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: String, options: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: js.Object, options: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: Unit, options: js.Object): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: HTMLElement): js.Promise[T] = js.native
  def open(position: js.Array[Double], data: HTMLElement, options: js.Object): js.Promise[T] = js.native
  def open(position: Unit, data: String): js.Promise[T] = js.native
  def open(position: Unit, data: String, options: js.Object): js.Promise[T] = js.native
  def open(position: Unit, data: js.Object): js.Promise[T] = js.native
  def open(position: Unit, data: js.Object, options: js.Object): js.Promise[T] = js.native
  def open(position: Unit, data: Unit, options: js.Object): js.Promise[T] = js.native
  def open(position: Unit, data: HTMLElement): js.Promise[T] = js.native
  def open(position: Unit, data: HTMLElement, options: js.Object): js.Promise[T] = js.native
  
  def setData(data: String): js.Promise[T] = js.native
  def setData(data: js.Object): js.Promise[T] = js.native
  def setData(data: HTMLElement): js.Promise[T] = js.native
  
  def setOptions(options: js.Object): js.Promise[T] = js.native
  
  def setPosition(position: js.Array[Double]): js.Promise[T] = js.native
}
