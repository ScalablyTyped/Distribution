package typings.typedoc.componentMod

import typings.typedoc.utilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
@js.native
class ComponentEvent protected () extends Event {
  def this(name: String, owner: ComponentHost, component: AbstractComponent[ComponentHost]) = this()
  
  var component: AbstractComponent[ComponentHost] = js.native
  
  var owner: ComponentHost = js.native
}
/* static members */
@JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
@js.native
object ComponentEvent extends js.Object {
  
  var ADDED: String = js.native
  
  var REMOVED: String = js.native
}
