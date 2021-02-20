package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.instanceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withInstanceIdMod {
  
  // prettier-ignore
  @JSImport("@wordpress/compose/higher-order/with-instance-id", JSImport.Default)
  @js.native
  def default[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, instanceId]] = js.native
}
