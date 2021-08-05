package typings.tuyaPanelKit

import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationStateMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/useNavigationState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](selector: Selector[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type Selector[T] = js.Function1[/* state */ NavigationState[ParamListBase], T]
}
