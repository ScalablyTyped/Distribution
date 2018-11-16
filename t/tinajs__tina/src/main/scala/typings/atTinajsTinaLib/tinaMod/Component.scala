package typings
package atTinajsTinaLib.tinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tinajs/tina", "Component")
@js.native
class Component () extends js.Object {
  var data: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def setData(data: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
}

@JSImport("@tinajs/tina", "Component")
@js.native
object Component extends js.Object {
  def define(definitions: stdLib.Partial[atTinajsTinaLib.tinaMod.ComponentDefinitions]): scala.Unit = js.native
  def mixin(definitions: stdLib.Partial[atTinajsTinaLib.tinaMod.ComponentDefinitions]): scala.Unit = js.native
}

