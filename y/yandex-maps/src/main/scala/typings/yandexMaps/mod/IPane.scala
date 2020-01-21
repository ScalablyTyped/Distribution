package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.yandexMapsStrings.hidden
import typings.yandexMaps.yandexMapsStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPane extends IEventEmitter {
  def destroy(): Unit
  def getElement(): HTMLElement
  def getMap(): Map_
  def getOverflow(): visible | hidden
  def getZIndex(): Double
}

object IPane {
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: IEventManager,
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
  
    __obj.asInstanceOf[IPane]
  }
}

