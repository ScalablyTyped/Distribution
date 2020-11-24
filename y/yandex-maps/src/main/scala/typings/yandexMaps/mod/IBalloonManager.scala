package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBalloonManager[T] extends IPopupManager[T] {
  
  def autoPan(): js.Promise[T] = js.native
}
