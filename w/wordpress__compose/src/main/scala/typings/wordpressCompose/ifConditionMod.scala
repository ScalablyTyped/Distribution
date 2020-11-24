package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/compose/higher-order/if-condition", JSImport.Namespace)
@js.native
object ifConditionMod extends js.Object {
  
  def default[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ComponentType[P], FC[P]] = js.native
}
