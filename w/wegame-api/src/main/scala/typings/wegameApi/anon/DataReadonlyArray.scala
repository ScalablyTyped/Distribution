package typings.wegameApi.anon

import typings.wegameApi.wx.types.UserInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReadonlyArray extends StObject {
  
  var data: js.Array[UserInfo]
}
object DataReadonlyArray {
  
  inline def apply(data: js.Array[UserInfo]): DataReadonlyArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReadonlyArray]
  }
  
  extension [Self <: DataReadonlyArray](x: Self) {
    
    inline def setData(value: js.Array[UserInfo]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: UserInfo*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
