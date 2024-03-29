package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --剪切板
trait ClipboardData extends StObject {
  
  var data: String
}
object ClipboardData {
  
  inline def apply(data: String): ClipboardData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipboardData] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
