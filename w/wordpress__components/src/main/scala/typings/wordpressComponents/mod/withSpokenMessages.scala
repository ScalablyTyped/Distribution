package typings.wordpressComponents.mod

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.debouncedSpeak
import typings.wordpressComponents.wordpressComponentsStrings.speak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components", "withSpokenMessages")
@js.native
object withSpokenMessages extends js.Object {
  
  def apply[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, speak | debouncedSpeak]] = js.native
}
