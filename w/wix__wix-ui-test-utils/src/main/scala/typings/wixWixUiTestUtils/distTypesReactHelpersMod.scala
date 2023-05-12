package typings.wixWixUiTestUtils

import typings.react.mod.FunctionComponent
import typings.std.HTMLElement
import typings.wixWixUiTestUtils.anon.Instantiable
import typings.wixWixUiTestUtils.anon.TypeofSimulate
import typings.wixWixUiTestUtils.distTypesReactHelpersHelpersMod.ControlledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesReactHelpersMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/react-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeControlled[T /* <: ControlledComponentProps */](Component: FunctionComponent[T]): Instantiable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[T]]
  
  inline def reactEventTrigger(): TypeofSimulate = ^.asInstanceOf[js.Dynamic].applyDynamic("reactEventTrigger")().asInstanceOf[TypeofSimulate]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
