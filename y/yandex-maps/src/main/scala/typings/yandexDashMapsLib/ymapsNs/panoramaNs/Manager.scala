package typings
package yandexDashMapsLib.ymapsNs.panoramaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.panorama.Manager")
@js.native
class Manager ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def closePlayer(): scala.Unit = js.native
  def disableLookup(): scala.Unit = js.native
  def enableLookup(): scala.Unit = js.native
  def getPlayer(): Player = js.native
  def isLookupEnabled(): scala.Boolean = js.native
  def openPlayer(panorama: js.Array[yandexDashMapsLib.ymapsNs.IPanorama]): stdLib.Promise[scala.Unit] = js.native
  def openPlayer(panorama: scala.Double): stdLib.Promise[scala.Unit] = js.native
}

