package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintManager extends StObject {
  
  var onprinttaskrequested: Any
}
object IPrintManager {
  
  inline def apply(onprinttaskrequested: Any): IPrintManager = {
    val __obj = js.Dynamic.literal(onprinttaskrequested = onprinttaskrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintManager]
  }
  
  extension [Self <: IPrintManager](x: Self) {
    
    inline def setOnprinttaskrequested(value: Any): Self = StObject.set(x, "onprinttaskrequested", value.asInstanceOf[js.Any])
  }
}
