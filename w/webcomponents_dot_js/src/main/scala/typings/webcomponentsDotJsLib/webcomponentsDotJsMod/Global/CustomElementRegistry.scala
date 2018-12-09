package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementRegistry extends js.Object {
  def define(name: java.lang.String, constructor: js.Function): scala.Unit = js.native
  def define(name: java.lang.String, constructor: js.Function, options: ElementDefinitionOptions): scala.Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def whenDefined(name: java.lang.String): js.Thenable[scala.Unit] = js.native
}

