package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.setTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSafeTimeoutMod {
  
  // prettier-ignore
  @JSImport("@wordpress/compose/higher-order/with-safe-timeout", JSImport.Default)
  @js.native
  def default[T /* <: ComponentType[_] */](component: T): ComponentType[Omit[_, setTimeout]] = js.native
}
