package typings
package typedocLib.distLibUtilsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
@js.native
class ComponentEvent protected ()
  extends typedocLib.distLibUtilsEventsMod.Event {
  def this(name: java.lang.String, owner: ComponentHost, component: AbstractComponent[ComponentHost]) = this()
  var component: AbstractComponent[ComponentHost] = js.native
  var owner: ComponentHost = js.native
}

@JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
@js.native
object ComponentEvent extends js.Object {
  var ADDED: java.lang.String = js.native
  var REMOVED: java.lang.String = js.native
}

