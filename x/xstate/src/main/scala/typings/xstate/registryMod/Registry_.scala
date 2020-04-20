package typings.xstate.registryMod

import typings.xstate.actorMod.Actor
import typings.xstate.typesMod.AnyEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry_ extends js.Object {
  def bookId(): String
  def free(id: String): Unit
  def get(id: String): js.UndefOr[Actor[_, AnyEventObject]]
  def register(id: String, actor: Actor[_, AnyEventObject]): String
}

object Registry_ {
  @scala.inline
  def apply(
    bookId: () => String,
    free: String => Unit,
    get: String => js.UndefOr[Actor[_, AnyEventObject]],
    register: (String, Actor[_, AnyEventObject]) => String
  ): Registry_ = {
    val __obj = js.Dynamic.literal(bookId = js.Any.fromFunction0(bookId), free = js.Any.fromFunction1(free), get = js.Any.fromFunction1(get), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Registry_]
  }
}

