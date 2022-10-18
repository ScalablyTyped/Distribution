package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithSpokenMessagesMod {
  
  @JSImport("@wordpress/components/higher-order/with-spoken-messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'speak' | 'debouncedSpeak'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'speak' | 'debouncedSpeak'>> : never */ js.Any]
}
