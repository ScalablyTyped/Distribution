package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.PartialState<std.Readonly<any>> | undefined} */
trait Readonlykeystringnamestri extends StObject {
  
  val key: String
  
  val name: String
  
  val params: js.UndefOr[js.Object] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var state: js.UndefOr[Any | PartialState[Any]] = js.undefined
}
object Readonlykeystringnamestri {
  
  inline def apply(key: String, name: String): Readonlykeystringnamestri = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykeystringnamestri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlykeystringnamestri] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setState(value: Any | PartialState[Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
