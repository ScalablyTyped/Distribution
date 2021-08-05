package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadDriver extends StObject {
  
  var html5: js.Any
}
object UploadDriver {
  
  inline def apply(html5: js.Any): UploadDriver = {
    val __obj = js.Dynamic.literal(html5 = html5.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDriver]
  }
  
  extension [Self <: UploadDriver](x: Self) {
    
    inline def setHtml5(value: js.Any): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
  }
}
