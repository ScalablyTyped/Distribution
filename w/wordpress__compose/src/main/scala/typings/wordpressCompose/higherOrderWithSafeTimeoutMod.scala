package typings.wordpressCompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithSafeTimeoutMod {
  
  @JSImport("@wordpress/compose/higher-order/with-safe-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default[T /* <: ComponentType[Any] */](component: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'setTimeout'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'setTimeout'>> : never */ js.Any]
}
