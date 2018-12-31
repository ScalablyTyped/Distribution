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

