package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPrint extends StObject {
  
  @JSName("$customPrint")
  def $customPrint(args: js.Any*): js.Any
  @JSName("$customPrint")
  var $customPrint_Original: WebixCallback
}
object CustomPrint {
  
  @JSImport("webix", "CustomPrint")
  @js.native
  val ^ : CustomPrint = js.native
  
  @scala.inline
  implicit class CustomPrintMutableBuilder[Self <: CustomPrint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$customPrint(value: WebixCallback): Self = StObject.set(x, "$customPrint", value.asInstanceOf[js.Any])
  }
}
