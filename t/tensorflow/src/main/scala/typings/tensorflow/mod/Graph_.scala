package typings.tensorflow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph_ extends js.Object {
  def createSession(): Session
  def delete(): js.Any
}

object Graph_ {
  @scala.inline
  def apply(createSession: () => Session, delete: () => js.Any): Graph_ = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction0(createSession), delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[Graph_]
  }
}

