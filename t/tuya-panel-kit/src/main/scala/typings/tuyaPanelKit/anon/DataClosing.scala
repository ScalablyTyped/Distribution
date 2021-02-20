package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataClosing extends StObject {
  
  var data: Closing = js.native
}
object DataClosing {
  
  @scala.inline
  def apply(data: Closing): DataClosing = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataClosing]
  }
  
  @scala.inline
  implicit class DataClosingMutableBuilder[Self <: DataClosing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Closing): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
