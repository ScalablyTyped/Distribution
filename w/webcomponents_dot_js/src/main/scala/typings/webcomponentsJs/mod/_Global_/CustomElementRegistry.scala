package typings.webcomponentsJs.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementRegistry extends js.Object {
  def define(name: String, constructor: js.Function): Unit = js.native
  def define(name: String, constructor: js.Function, options: ElementDefinitionOptions): Unit = js.native
  def get(name: String): js.Any = js.native
  def whenDefined(name: String): js.Thenable[Unit] = js.native
}

