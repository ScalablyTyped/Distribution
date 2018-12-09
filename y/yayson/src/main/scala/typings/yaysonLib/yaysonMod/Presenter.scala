package typings
package yaysonLib.yaysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presenter extends js.Object {
  var `type`: java.lang.String = js.native
  def id(instance: js.Object): java.lang.String = js.native
  def render(instanceOrCollection: js.Object): js.Any = js.native
  def render(instanceOrCollection: js.Object, options: yaysonLib.yaysonMod.yNs.JsonOptions): js.Any = js.native
  def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
  def render[T](instanceOrCollection: js.Thenable[T], options: yaysonLib.yaysonMod.yNs.JsonOptions): js.Thenable[T] = js.native
  def toJSON(instanceOrCollection: js.Object): js.Any = js.native
  def toJSON(instanceOrCollection: js.Object, options: yaysonLib.yaysonMod.yNs.JsonOptions): js.Any = js.native
}

