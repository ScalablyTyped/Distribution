package typings.wixUiTestUtils

import typings.react.mod.FunctionComponent
import typings.std.HTMLElement
import typings.wixUiTestUtils.anon.Instantiable
import typings.wixUiTestUtils.anon.TypeofSimulate
import typings.wixUiTestUtils.distSrcReactHelpersHelpersMod.ControlledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReactHelpersMod {
  
  @JSImport("wix-ui-test-utils/dist/src/react-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeControlled[T /* <: ControlledComponentProps */](Component: FunctionComponent[T]): Instantiable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[T]]
  
  inline def reactEventTrigger(): TypeofSimulate = ^.asInstanceOf[js.Dynamic].applyDynamic("reactEventTrigger")().asInstanceOf[TypeofSimulate]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
