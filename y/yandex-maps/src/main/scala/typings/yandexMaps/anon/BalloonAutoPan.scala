package typings.yandexMaps.anon

import typings.std.HTMLElement
import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.IOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yandex-maps.yandex-maps.objectManager.Balloon */
@js.native
trait BalloonAutoPan extends StObject {
  
  def autoPan(): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  @JSName("autoPan")
  var autoPan_Original: js.Function0[js.Promise[this.type]] = js.native
  
  def close(): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  def close(force: Boolean): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  @JSName("close")
  var close_Original: js.Function1[/* force */ js.UndefOr[Boolean], js.Promise[this.type]] = js.native
  
  def destroy(): Unit = js.native
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit] = js.native
  
  var events: IEventManager[js.Object] = js.native
  
  def getData(): js.Object | Null = js.native
  @JSName("getData")
  var getData_Original: js.Function0[js.Object | Null] = js.native
  
  def getOptions(): IOptionManager | Null = js.native
  @JSName("getOptions")
  var getOptions_Original: js.Function0[IOptionManager | Null] = js.native
  
  def getOverlay(): js.Promise[IOverlay | Null] = js.native
  
  def getOverlaySync(): IOverlay | Null = js.native
  @JSName("getOverlaySync")
  var getOverlaySync_Original: js.Function0[IOverlay | Null] = js.native
  
  @JSName("getOverlay")
  var getOverlay_Original: js.Function0[js.Promise[IOverlay | Null]] = js.native
  
  def getPosition(): js.Array[Double] | Null = js.native
  @JSName("getPosition")
  var getPosition_Original: js.Function0[js.Array[Double] | Null] = js.native
  
  def isOpen(): Boolean = js.native
  @JSName("isOpen")
  var isOpen_Original: js.Function0[Boolean] = js.native
  
  def open(objectId: String): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  def open(objectId: String, anchorPixelPosition: Boolean): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  def open(objectId: js.Object): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  def open(objectId: js.Object, anchorPixelPosition: Boolean): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  
  def setData(data: String): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  def setData(data: js.Object): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  def setData(data: HTMLElement): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  @JSName("setData")
  var setData_Original: js.Function1[/* data */ js.Object | String | HTMLElement, js.Promise[this.type]] = js.native
  
  def setOptions(options: js.Object): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  @JSName("setOptions")
  var setOptions_Original: js.Function1[/* options */ js.Object, js.Promise[this.type]] = js.native
  
  def setPosition(position: js.Array[Double]): js.Promise[typings.yandexMaps.mod.objectManager.Balloon] = js.native
  @JSName("setPosition")
  var setPosition_Original: js.Function1[/* position */ js.Array[Double], js.Promise[this.type]] = js.native
}
