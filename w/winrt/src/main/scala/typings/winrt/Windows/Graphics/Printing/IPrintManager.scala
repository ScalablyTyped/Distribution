package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintManager extends StObject {
  
  var onprinttaskrequested: js.Any = js.native
}
object IPrintManager {
  
  @scala.inline
  def apply(onprinttaskrequested: js.Any): IPrintManager = {
    val __obj = js.Dynamic.literal(onprinttaskrequested = onprinttaskrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintManager]
  }
  
  @scala.inline
  implicit class IPrintManagerMutableBuilder[Self <: IPrintManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnprinttaskrequested(value: js.Any): Self = StObject.set(x, "onprinttaskrequested", value.asInstanceOf[js.Any])
  }
}
