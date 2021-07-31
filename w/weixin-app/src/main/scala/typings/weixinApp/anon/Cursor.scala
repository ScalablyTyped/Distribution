package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
  var cursor: Double
  
  var value: String
}
object Cursor {
  
  @scala.inline
  def apply(cursor: Double, value: String): Cursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
  
  @scala.inline
  implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
