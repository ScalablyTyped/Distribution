package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.debouncedSpeak
import typings.wordpressComponents.wordpressComponentsStrings.speak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSpokenMessagesMod {
  
  @JSImport("@wordpress/components/higher-order/with-spoken-messages", JSImport.Default)
  @js.native
  def default[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, speak | debouncedSpeak]] = js.native
}
