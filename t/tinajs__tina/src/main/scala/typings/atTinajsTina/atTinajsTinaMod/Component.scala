package typings.atTinajsTina.atTinajsTinaMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tinajs/tina", "Component")
@js.native
class Component () extends js.Object {
  var data: StringDictionary[js.Any] = js.native
  def setData(data: StringDictionary[js.Any]): Unit = js.native
}

/* static members */
@JSImport("@tinajs/tina", "Component")
@js.native
object Component extends js.Object {
  def define(definitions: Partial[ComponentDefinitions]): Unit = js.native
  def mixin(definitions: Partial[ComponentDefinitions]): Unit = js.native
}

