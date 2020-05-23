package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.debouncedSpeak
import typings.wordpressComponents.wordpressComponentsStrings.speak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/higher-order/with-spoken-messages", JSImport.Namespace)
@js.native
object withSpokenMessagesMod extends js.Object {
  def default[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, speak | debouncedSpeak]] = js.native
}

