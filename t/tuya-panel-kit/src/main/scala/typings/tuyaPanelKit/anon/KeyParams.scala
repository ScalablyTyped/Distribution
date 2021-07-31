package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyParams[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var key: String
  
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ] = js.undefined
}
object KeyParams {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](key: String): KeyParams[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyParams[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class KeyParamsMutableBuilder[Self <: KeyParams[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self & (KeyParams[ParamList, RouteName])) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
