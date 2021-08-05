package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFiltersMod {
  
  @JSImport("@wordpress/components/higher-order/with-filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default(hookName: String): js.Function1[/* wrapped */ js.Any, ComponentType[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wrapped */ js.Any, ComponentType[js.Any]]]
  
  inline def default_P[P](hookName: String): js.Function1[/* wrapped */ ComponentType[js.Any], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wrapped */ ComponentType[js.Any], ComponentType[P]]]
}
