package typings
package swigLib.swigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLoader extends js.Object {
  def load(identifier: java.lang.String): scala.Unit = js.native
  def load(
    identifier: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("load")
  def load_Any(identifier: java.lang.String): js.Any = js.native
  def resolve(to: java.lang.String, from: java.lang.String): java.lang.String = js.native
}

