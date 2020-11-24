package typings.tuyaPanelKit.stackRouterMod

import typings.tuyaPanelKit.anon.Count
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.tuyaPanelKitStrings.POP
import typings.tuyaPanelKit.tuyaPanelKitStrings.POP_TO_TOP
import typings.tuyaPanelKit.tuyaPanelKitStrings.PUSH
import typings.tuyaPanelKit.tuyaPanelKitStrings.REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tuyaPanelKit.anon.PayloadSource
  - typings.tuyaPanelKit.anon.SourceTarget
  - typings.tuyaPanelKit.anon.TargetType
  - typings.tuyaPanelKit.anon.SourceTargetType
*/
trait StackActionType extends js.Object
object StackActionType {
  
  @scala.inline
  def PayloadSource(payload: Params, `type`: REPLACE): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def SourceTarget(payload: Params, `type`: PUSH): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def TargetType(payload: Count, `type`: POP): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def SourceTargetType(`type`: POP_TO_TOP): StackActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
}
