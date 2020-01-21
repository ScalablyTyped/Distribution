package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBalloonManager[T] extends IPopupManager[T] {
  def autoPan(): js.Promise[T] = js.native
}

