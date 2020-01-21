package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChild[T] extends IEventEmitter {
  def getParent(): js.Object | Null = js.native
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
}

