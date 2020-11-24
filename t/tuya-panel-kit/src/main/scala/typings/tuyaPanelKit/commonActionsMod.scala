package typings.tuyaPanelKit

import typings.tuyaPanelKit.anon.Key
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", JSImport.Namespace)
@js.native
object commonActionsMod extends js.Object {
  
  def goBack(): Action = js.native
  
  def navigate(name: String): Action = js.native
  def navigate(name: String, params: js.Object): Action = js.native
  def navigate(route: Key): Action = js.native
  def navigate(route: Params): Action = js.native
  
  def reset(): Action = js.native
  def reset(state: ResetState): Action = js.native
  
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.Source
    - typings.tuyaPanelKit.anon.Payload
    - typings.tuyaPanelKit.anon.PayloadSourceTarget
    - typings.tuyaPanelKit.anon.Type
  */
  trait Action extends js.Object
  
  trait _ResetState extends js.Object
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.PartialStateNavigationSta
    - typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase]
    - typings.tuyaPanelKit.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
}
