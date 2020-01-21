package typings.swig.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLoader extends js.Object {
  def load(identifier: String): js.Any = js.native
  def load(identifier: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("load")
  def load_Unit(identifier: String): Unit = js.native
  def resolve(to: String, from: String): String = js.native
}

