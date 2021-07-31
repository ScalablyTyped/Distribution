package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxClosingTagInfo extends StObject {
  
  val newText: java.lang.String
}
object JsxClosingTagInfo {
  
  @scala.inline
  def apply(newText: java.lang.String): JsxClosingTagInfo = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxClosingTagInfo]
  }
  
  @scala.inline
  implicit class JsxClosingTagInfoMutableBuilder[Self <: JsxClosingTagInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewText(value: java.lang.String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
  }
}
