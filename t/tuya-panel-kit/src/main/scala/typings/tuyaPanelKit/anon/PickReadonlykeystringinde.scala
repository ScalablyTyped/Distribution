package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'stale' | 'key' | 'index' | 'routeNames' | 'history' | 'type'> & {  routes :std.Array<std.Pick<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.Route<string, object | undefined>, 'name' | 'params'>>} */
@js.native
trait PickReadonlykeystringinde extends StObject {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: Double = js.native
  
  var key: String = js.native
  
  var routeNames: js.Array[String] = js.native
  
  // tslint:disable-next-line no-redundant-undefined array-type use-default-type-parameter
  var routes: js.Array[PickRoutestringobjectunde] = js.native
  
  var stale: `false` = js.native
  
  var `type`: String = js.native
}
object PickReadonlykeystringinde {
  
  @scala.inline
  def apply(
    index: Double,
    key: String,
    routeNames: js.Array[String],
    routes: js.Array[PickRoutestringobjectunde],
    stale: `false`,
    `type`: String
  ): PickReadonlykeystringinde = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReadonlykeystringinde]
  }
  
  @scala.inline
  implicit class PickReadonlykeystringindeMutableBuilder[Self <: PickReadonlykeystringinde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[PickRoutestringobjectunde]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: PickRoutestringobjectunde*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
