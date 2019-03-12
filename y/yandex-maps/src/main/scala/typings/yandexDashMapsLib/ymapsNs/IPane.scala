package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPane extends IEventEmitter {
  def destroy(): scala.Unit
  def getElement(): stdLib.HTMLElement
  def getMap(): Map
  def getOverflow(): yandexDashMapsLib.yandexDashMapsLibStrings.visible | yandexDashMapsLib.yandexDashMapsLibStrings.hidden
  def getZIndex(): scala.Double
}

object IPane {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    events: IEventManager,
    getElement: () => stdLib.HTMLElement,
    getMap: () => Map,
    getOverflow: () => yandexDashMapsLib.yandexDashMapsLibStrings.visible | yandexDashMapsLib.yandexDashMapsLibStrings.hidden,
    getZIndex: () => scala.Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events, getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
  
    __obj.asInstanceOf[IPane]
  }
}

