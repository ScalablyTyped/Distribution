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
    destroy: js.Function0[scala.Unit],
    events: IEventManager,
    getElement: js.Function0[stdLib.HTMLElement],
    getMap: js.Function0[Map],
    getOverflow: js.Function0[
      yandexDashMapsLib.yandexDashMapsLibStrings.visible | yandexDashMapsLib.yandexDashMapsLibStrings.hidden
    ],
    getZIndex: js.Function0[scala.Double]
  ): IPane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("getElement")(getElement)
    __obj.updateDynamic("getMap")(getMap)
    __obj.updateDynamic("getOverflow")(getOverflow)
    __obj.updateDynamic("getZIndex")(getZIndex)
    __obj.asInstanceOf[IPane]
  }
}

