package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Popup")
@js.native
class Popup[T] protected () extends IPopup[T] {
  def this(map: Map) = this()
  def this(map: Map, options: IPopupOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  /* CompleteClass */
  override var options: IOptionManager = js.native
}

