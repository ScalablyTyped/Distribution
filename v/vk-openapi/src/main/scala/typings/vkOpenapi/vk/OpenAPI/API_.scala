package typings.vkOpenapi.vk.OpenAPI

import typings.vkOpenapi.vk.OpenAPI.Api.API
import typings.vkOpenapi.vk.OpenAPI.Goal.GoalEvent
import typings.vkOpenapi.vk.OpenAPI.Goal.GoalParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait API_ extends StObject {
  
  var Api: API
  
  var Auth: typings.vkOpenapi.vk.OpenAPI.Auth.API
  
  def Goal(goalEvent: GoalEvent): Unit
  def Goal(goalEvent: GoalEvent, goalParams: GoalParams): Unit
  @JSName("Goal")
  var Goal_Original: typings.vkOpenapi.vk.OpenAPI.Goal.API
  
  var Observer: typings.vkOpenapi.vk.OpenAPI.Observer.API
  
  var Retargeting: typings.vkOpenapi.vk.OpenAPI.Retargeting.API
  
  var Widgets: typings.vkOpenapi.vk.OpenAPI.Widgets.API
  
  def init(params: InitParams): Unit
}
object API_ {
  
  inline def apply(
    Api: API,
    Auth: typings.vkOpenapi.vk.OpenAPI.Auth.API,
    Goal: (/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams]) => Unit,
    Observer: typings.vkOpenapi.vk.OpenAPI.Observer.API,
    Retargeting: typings.vkOpenapi.vk.OpenAPI.Retargeting.API,
    Widgets: typings.vkOpenapi.vk.OpenAPI.Widgets.API,
    init: InitParams => Unit
  ): API_ = {
    val __obj = js.Dynamic.literal(Api = Api.asInstanceOf[js.Any], Auth = Auth.asInstanceOf[js.Any], Goal = js.Any.fromFunction2(Goal), Observer = Observer.asInstanceOf[js.Any], Retargeting = Retargeting.asInstanceOf[js.Any], Widgets = Widgets.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[API_]
  }
  
  extension [Self <: API_](x: Self) {
    
    inline def setApi(value: API): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: typings.vkOpenapi.vk.OpenAPI.Auth.API): Self = StObject.set(x, "Auth", value.asInstanceOf[js.Any])
    
    inline def setGoal(value: (/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams]) => Unit): Self = StObject.set(x, "Goal", js.Any.fromFunction2(value))
    
    inline def setInit(value: InitParams => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setObserver(value: typings.vkOpenapi.vk.OpenAPI.Observer.API): Self = StObject.set(x, "Observer", value.asInstanceOf[js.Any])
    
    inline def setRetargeting(value: typings.vkOpenapi.vk.OpenAPI.Retargeting.API): Self = StObject.set(x, "Retargeting", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: typings.vkOpenapi.vk.OpenAPI.Widgets.API): Self = StObject.set(x, "Widgets", value.asInstanceOf[js.Any])
  }
}
