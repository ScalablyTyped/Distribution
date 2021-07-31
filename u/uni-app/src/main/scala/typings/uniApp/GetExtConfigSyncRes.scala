package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigSyncRes extends StObject {
  
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.undefined
}
object GetExtConfigSyncRes {
  
  @scala.inline
  def apply(): GetExtConfigSyncRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigSyncRes]
  }
  
  @scala.inline
  implicit class GetExtConfigSyncResMutableBuilder[Self <: GetExtConfigSyncRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtConfig(value: js.Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtConfigUndefined: Self = StObject.set(x, "extConfig", js.undefined)
  }
}
