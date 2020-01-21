package typings.yayson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presenter extends js.Object {
  var `type`: String = js.native
  def id(instance: js.Object): String = js.native
  def render(instanceOrCollection: js.Object): js.Any = js.native
  def render(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
  def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
  def render[T](instanceOrCollection: js.Thenable[T], options: JsonOptions): js.Thenable[T] = js.native
  def toJSON(instanceOrCollection: js.Object): js.Any = js.native
  def toJSON(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
}

