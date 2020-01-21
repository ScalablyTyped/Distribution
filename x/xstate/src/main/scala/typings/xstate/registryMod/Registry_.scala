package typings.xstate.registryMod

import typings.xstate.actorMod.Actor
import typings.xstate.typesMod.AnyEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry_ extends js.Object {
  def get(id: String): js.UndefOr[Actor[_, AnyEventObject]]
  def lookup(actor: Actor[_, AnyEventObject]): js.UndefOr[String]
  def register(actor: Actor[_, AnyEventObject]): String
}

object Registry_ {
  @scala.inline
  def apply(
    get: String => js.UndefOr[Actor[_, AnyEventObject]],
    lookup: Actor[_, AnyEventObject] => js.UndefOr[String],
    register: Actor[_, AnyEventObject] => String
  ): Registry_ = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[Registry_]
  }
}

