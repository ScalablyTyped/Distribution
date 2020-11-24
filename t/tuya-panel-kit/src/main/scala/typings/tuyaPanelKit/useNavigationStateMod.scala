package typings.tuyaPanelKit

import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/core/useNavigationState", JSImport.Namespace)
@js.native
object useNavigationStateMod extends js.Object {
  
  def default[T](selector: Selector[T]): T = js.native
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type Selector[T] = js.Function1[/* state */ NavigationState[ParamListBase], T]
}
