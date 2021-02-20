package typings.vkOpenapi.vk.OpenAPI

import typings.vkOpenapi.vk.OpenAPI.Api.API
import typings.vkOpenapi.vk.OpenAPI.Goal.GoalEvent
import typings.vkOpenapi.vk.OpenAPI.Goal.GoalParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API_ extends StObject {
  
  var Api: API = js.native
  
  var Auth: typings.vkOpenapi.vk.OpenAPI.Auth.API = js.native
  
  def Goal(goalEvent: GoalEvent): Unit = js.native
  def Goal(goalEvent: GoalEvent, goalParams: GoalParams): Unit = js.native
  @JSName("Goal")
  var Goal_Original: typings.vkOpenapi.vk.OpenAPI.Goal.API = js.native
  
  var Observer: typings.vkOpenapi.vk.OpenAPI.Observer.API = js.native
  
  var Retargeting: typings.vkOpenapi.vk.OpenAPI.Retargeting.API = js.native
  
  var Widgets: typings.vkOpenapi.vk.OpenAPI.Widgets.API = js.native
  
  def init(params: InitParams): Unit = js.native
}
