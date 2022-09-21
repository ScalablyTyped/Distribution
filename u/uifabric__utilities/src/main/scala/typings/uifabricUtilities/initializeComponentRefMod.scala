package typings.uifabricUtilities

import typings.react.mod.Component
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeComponentRefMod {
  
  @JSImport("@uifabric/utilities/lib/initializeComponentRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeComponentRef[TProps /* <: IBaseProps[Any] */, TState](obj: Component[TProps, TState, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeComponentRef")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
