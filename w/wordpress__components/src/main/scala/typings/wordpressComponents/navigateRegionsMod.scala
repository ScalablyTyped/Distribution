package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigateRegionsMod {
  
  @JSImport("@wordpress/components/higher-order/navigate-regions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Any]]
}
