package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICursor extends StObject {
  
  var cursor: String
}
object ICursor {
  
  @scala.inline
  def apply(cursor: String): ICursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursor]
  }
  
  @scala.inline
  implicit class ICursorMutableBuilder[Self <: ICursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
  }
}
