package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.behavior.ScrollZoom")
@js.native
class ScrollZoom ()
  extends yandexDashMapsLib.ymapsNs.IBehavior {
  def this(options: IScrollZoomOptions) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

