package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataAny extends StObject {
  
  var data: js.Any
}
object DataAny {
  
  @scala.inline
  def apply(data: js.Any): DataAny = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAny]
  }
  
  @scala.inline
  implicit class DataAnyMutableBuilder[Self <: DataAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
