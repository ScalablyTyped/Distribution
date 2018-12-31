package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*Interfaces*/
/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.IChild because Would inherit conflicting mutable fields List(events))*/
@js.native
trait IBaloon[T]
  extends IPopup[T]
     with IFreezable {
  def autoPan(): js.Promise[T] = js.native
}

