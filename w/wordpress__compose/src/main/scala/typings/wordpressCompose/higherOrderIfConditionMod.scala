package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderIfConditionMod {
  
  @JSImport("@wordpress/compose/higher-order/if-condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ComponentType[P], FC[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], FC[P]]]
}
