package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadDriver extends StObject {
  
  var html5: js.Any
}
object UploadDriver {
  
  @JSImport("webix", "UploadDriver")
  @js.native
  val ^ : UploadDriver = js.native
  
  extension [Self <: UploadDriver](x: Self) {
    
    inline def setHtml5(value: js.Any): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
  }
}
