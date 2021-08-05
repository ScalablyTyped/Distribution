package typings.wegameApi.anon

import typings.wegameApi.UserGameData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var data: js.Array[UserGameData]
}
object `2` {
  
  inline def apply(data: js.Array[UserGameData]): `2` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setData(value: js.Array[UserGameData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: UserGameData*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
