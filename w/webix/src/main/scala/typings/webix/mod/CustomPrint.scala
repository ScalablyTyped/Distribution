package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPrint extends StObject {
  
  @JSName("$customPrint")
  def $customPrint(args: Any*): Any
  @JSName("$customPrint")
  var $customPrint_Original: WebixCallback
}
object CustomPrint {
  
  @JSImport("webix", "CustomPrint")
  @js.native
  val ^ : CustomPrint = js.native
  
  extension [Self <: CustomPrint](x: Self) {
    
    inline def set$customPrint(value: WebixCallback): Self = StObject.set(x, "$customPrint", value.asInstanceOf[js.Any])
  }
}
