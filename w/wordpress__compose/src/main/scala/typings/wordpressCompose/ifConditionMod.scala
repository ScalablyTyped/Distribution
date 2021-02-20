package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifConditionMod {
  
  @JSImport("@wordpress/compose/higher-order/if-condition", JSImport.Default)
  @js.native
  def default[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ComponentType[P], FC[P]] = js.native
}
