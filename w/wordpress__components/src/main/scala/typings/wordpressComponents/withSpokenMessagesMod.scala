package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.debouncedSpeak
import typings.wordpressComponents.wordpressComponentsStrings.speak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSpokenMessagesMod {
  
  @JSImport("@wordpress/components/higher-order/with-spoken-messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: ComponentType[Any] */](wrapped: T): ComponentType[Omit[Any, speak | debouncedSpeak]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[Any, speak | debouncedSpeak]]]
}
