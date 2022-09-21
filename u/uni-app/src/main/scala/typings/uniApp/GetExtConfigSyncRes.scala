package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigSyncRes extends StObject {
  
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[Any] = js.undefined
}
object GetExtConfigSyncRes {
  
  inline def apply(): GetExtConfigSyncRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigSyncRes]
  }
  
  extension [Self <: GetExtConfigSyncRes](x: Self) {
    
    inline def setExtConfig(value: Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
    
    inline def setExtConfigUndefined: Self = StObject.set(x, "extConfig", js.undefined)
  }
}
