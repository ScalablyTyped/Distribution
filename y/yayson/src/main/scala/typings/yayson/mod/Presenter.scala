package typings.yayson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presenter extends js.Object {
  
  def id(instance: js.Object): String = js.native
  
  def render(instanceOrCollection: js.Object): js.Any = js.native
  def render(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
  def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
  def render[T](instanceOrCollection: js.Thenable[T], options: JsonOptions): js.Thenable[T] = js.native
  
  def toJSON(instanceOrCollection: js.Object): js.Any = js.native
  def toJSON(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
  
  var `type`: String = js.native
}
