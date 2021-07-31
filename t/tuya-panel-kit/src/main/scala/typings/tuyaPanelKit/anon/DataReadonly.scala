package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReadonly[Data] extends StObject {
  
  val data: Data
}
object DataReadonly {
  
  @scala.inline
  def apply[Data](data: Data): DataReadonly[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReadonly[Data]]
  }
  
  @scala.inline
  implicit class DataReadonlyMutableBuilder[Self <: DataReadonly[?], Data] (val x: Self & DataReadonly[Data]) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
