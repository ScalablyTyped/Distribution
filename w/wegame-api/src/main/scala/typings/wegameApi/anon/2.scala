package typings.wegameApi.anon

import typings.wegameApi.UserGameData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var data: js.Array[UserGameData] = js.native
}
object `2` {
  
  @scala.inline
  def apply(data: js.Array[UserGameData]): `2` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[UserGameData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: UserGameData*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
