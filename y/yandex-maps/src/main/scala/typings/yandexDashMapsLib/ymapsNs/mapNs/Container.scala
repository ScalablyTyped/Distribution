package typings
package yandexDashMapsLib.ymapsNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.map.Container")
@js.native
class Container protected ()
  extends yandexDashMapsLib.ymapsNs.IDomEventEmitter {
  def this(parentElement: java.lang.String) = this()
  def this(parentElement: stdLib.HTMLElement) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def enterFullscreen(): scala.Unit = js.native
  def exitFullscreen(): scala.Unit = js.native
  def fitToViewport(): scala.Unit = js.native
  def fitToViewport(preservePixelPosition: scala.Boolean): scala.Unit = js.native
  def getElement(): stdLib.HTMLElement = js.native
  def getOffset(): js.Array[scala.Double] = js.native
  def getParentElement(): stdLib.HTMLElement = js.native
  def getSize(): js.Array[scala.Double] = js.native
  def isFullscreen(): scala.Boolean = js.native
}

