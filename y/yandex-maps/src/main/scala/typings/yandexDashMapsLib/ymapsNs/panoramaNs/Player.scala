package typings
package yandexDashMapsLib.ymapsNs.panoramaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.panorama.Player")
@js.native
class Player protected ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  def this(element: java.lang.String, panorama: yandexDashMapsLib.ymapsNs.IPanorama) = this()
  def this(element: stdLib.HTMLElement, panorama: yandexDashMapsLib.ymapsNs.IPanorama) = this()
  def this(element: java.lang.String, panorama: yandexDashMapsLib.ymapsNs.IPanorama, options: yandexDashMapsLib.Anon_Span) = this()
  def this(element: stdLib.HTMLElement, panorama: yandexDashMapsLib.ymapsNs.IPanorama, options: yandexDashMapsLib.Anon_Span) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def destroy(): scala.Unit = js.native
  def fitToViewport(): scala.Unit = js.native
  def getDirection(): js.Array[scala.Double] = js.native
  def getPanorama(): yandexDashMapsLib.ymapsNs.IPanorama = js.native
  def getSpan(): js.Array[scala.Double] = js.native
  def lookAt(point: js.Array[scala.Double]): this.type = js.native
  def moveTo(point: js.Array[scala.Double]): stdLib.Promise[scala.Unit] = js.native
  def moveTo(point: js.Array[scala.Double], options: yandexDashMapsLib.Anon_Layer): stdLib.Promise[scala.Unit] = js.native
  def setDirection(direction: java.lang.String): this.type = js.native
  def setDirection(direction: js.Array[scala.Double]): this.type = js.native
  def setPanorama(panorama: yandexDashMapsLib.ymapsNs.IPanorama): this.type = js.native
  def setSpan(span: java.lang.String): this.type = js.native
  def setSpan(span: js.Array[scala.Double]): this.type = js.native
}

