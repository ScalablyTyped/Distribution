package typings.yayson

import org.scalablytyped.runtime.Instantiable0
import typings.yayson.mod.JsonOptions
import typings.yayson.mod.Presenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPresenter extends Instantiable0[Presenter] {
  var adapter: String = js.native
  def render(instanceOrCollection: js.Object): js.Any = js.native
  def render(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
  def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
  def render[T](instanceOrCollection: js.Thenable[T], options: JsonOptions): js.Thenable[T] = js.native
  def toJSON(instanceOrCollection: js.Object): js.Any = js.native
  def toJSON(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
}

