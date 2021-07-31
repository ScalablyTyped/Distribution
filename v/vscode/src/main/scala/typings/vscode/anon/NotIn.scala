package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotIn extends StObject {
  
  var close: String
  
  var notIn: js.UndefOr[js.Array[String]] = js.undefined
  
  var open: String
}
object NotIn {
  
  @scala.inline
  def apply(close: String, open: String): NotIn = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotIn]
  }
  
  @scala.inline
  implicit class NotInMutableBuilder[Self <: NotIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotIn(value: js.Array[String]): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    @scala.inline
    def setNotInVarargs(value: String*): Self = StObject.set(x, "notIn", js.Array(value :_*))
    
    @scala.inline
    def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
