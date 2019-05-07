package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "panorama")
@js.native
object panoramaNs extends js.Object {
  @js.native
  class Manager ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def closePlayer(): scala.Unit = js.native
    def disableLookup(): scala.Unit = js.native
    def enableLookup(): scala.Unit = js.native
    def getPlayer(): Player = js.native
    def isLookupEnabled(): scala.Boolean = js.native
    def openPlayer(panorama: js.Array[yandexDashMapsLib.yandexDashMapsMod.IPanorama]): js.Promise[scala.Unit] = js.native
    def openPlayer(panorama: scala.Double): js.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class Player protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
    def this(element: java.lang.String, panorama: yandexDashMapsLib.yandexDashMapsMod.IPanorama) = this()
    def this(element: stdLib.HTMLElement, panorama: yandexDashMapsLib.yandexDashMapsMod.IPanorama) = this()
    def this(element: java.lang.String, panorama: yandexDashMapsLib.yandexDashMapsMod.IPanorama, options: yandexDashMapsLib.Anon_Always) = this()
    def this(element: stdLib.HTMLElement, panorama: yandexDashMapsLib.yandexDashMapsMod.IPanorama, options: yandexDashMapsLib.Anon_Always) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def destroy(): scala.Unit = js.native
    def fitToViewport(): scala.Unit = js.native
    def getDirection(): js.Array[scala.Double] = js.native
    def getPanorama(): yandexDashMapsLib.yandexDashMapsMod.IPanorama = js.native
    def getSpan(): js.Array[scala.Double] = js.native
    def lookAt(point: js.Array[scala.Double]): this.type = js.native
    def moveTo(point: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
    def moveTo(point: js.Array[scala.Double], options: yandexDashMapsLib.Anon_Direction): js.Promise[scala.Unit] = js.native
    def setDirection(direction: java.lang.String): this.type = js.native
    def setDirection(direction: js.Array[scala.Double]): this.type = js.native
    def setPanorama(panorama: yandexDashMapsLib.yandexDashMapsMod.IPanorama): this.type = js.native
    def setSpan(span: java.lang.String): this.type = js.native
    def setSpan(span: js.Array[scala.Double]): this.type = js.native
  }
  
}

