package typings.wixStyleReact.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: js.UndefOr[String | Date] = js.undefined
  
  var to: js.UndefOr[String | Date] = js.undefined
}
object From {
  
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String | Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setTo(value: String | Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
