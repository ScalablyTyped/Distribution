package typings.wordpressCompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureMod {
  
  @JSImport("@wordpress/compose/higher-order/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  @scala.inline
  def default[T /* <: ComponentType[js.Any] */](component: T): ComponentType[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Any]]
}
