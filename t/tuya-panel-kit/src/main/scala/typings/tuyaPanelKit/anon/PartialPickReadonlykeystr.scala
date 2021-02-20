package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> */
@js.native
trait PartialPickReadonlykeystr extends StObject {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var routeNames: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object PartialPickReadonlykeystr {
  
  @scala.inline
  def apply(): PartialPickReadonlykeystr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickReadonlykeystr]
  }
  
  @scala.inline
  implicit class PartialPickReadonlykeystrMutableBuilder[Self <: PartialPickReadonlykeystr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
