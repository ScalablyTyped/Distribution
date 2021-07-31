package typings.uifabricUtilities

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeRequestAnimationFrameMod {
  
  @JSImport("@uifabric/utilities/lib/safeRequestAnimationFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def safeRequestAnimationFrame(component: Component[js.Object, js.Object, js.Any]): js.Function1[/* cb */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeRequestAnimationFrame")(component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cb */ js.Function, Unit]]
}
