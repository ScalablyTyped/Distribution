package typings.tuyaPanelKit.stackRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions")
@js.native
object StackActions extends js.Object {
  
  def pop(): StackActionType = js.native
  def pop(count: Double): StackActionType = js.native
  
  def popToTop(): StackActionType = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def push(name: String): StackActionType = js.native
  def push(name: String, params: js.Object): StackActionType = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def replace(name: String): StackActionType = js.native
  def replace(name: String, params: js.Object): StackActionType = js.native
}
