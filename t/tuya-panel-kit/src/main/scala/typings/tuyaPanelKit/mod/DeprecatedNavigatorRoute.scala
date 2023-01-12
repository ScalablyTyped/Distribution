package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedNavigatorRoute
  extends StObject
     with /**
  * @language zh-CN
  * @description 其他属性
  * @defaultValue null
  */
/**
  * @language en-US
  * @description Other attributes
  * @defaultValue null
  */
/* prop */ StringDictionary[Any] {
  
  var id: String
}
object DeprecatedNavigatorRoute {
  
  inline def apply(id: String): DeprecatedNavigatorRoute = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedNavigatorRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedNavigatorRoute] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
