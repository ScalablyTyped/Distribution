package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOption[T] extends StObject {
  
  var data: T
}
object CommonOption {
  
  @scala.inline
  def apply[T](data: T): CommonOption[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOption[T]]
  }
  
  @scala.inline
  implicit class CommonOptionMutableBuilder[Self <: CommonOption[?], T] (val x: Self & CommonOption[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
