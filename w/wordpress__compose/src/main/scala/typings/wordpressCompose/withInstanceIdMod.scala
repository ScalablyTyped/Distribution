package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.instanceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withInstanceIdMod {
  
  @JSImport("@wordpress/compose/higher-order/with-instance-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  @scala.inline
  def default[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[Omit[js.Any, instanceId]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[js.Any, instanceId]]]
}
