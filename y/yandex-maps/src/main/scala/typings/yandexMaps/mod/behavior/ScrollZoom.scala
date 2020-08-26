package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.ScrollZoom")
@js.native
class ScrollZoom () extends IBehavior {
  def this(options: IScrollZoomOptions) = this()
  def setParent(parent: IControlParent): this.type = js.native
}

