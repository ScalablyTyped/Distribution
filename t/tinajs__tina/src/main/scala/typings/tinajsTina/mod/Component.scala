package typings.tinajsTina.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tinajsTina.anon.PartialComponentDefinitio
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
  def define(definitions: PartialComponentDefinitio): Unit = js.native
  def mixin(definitions: PartialComponentDefinitio): Unit = js.native
}

