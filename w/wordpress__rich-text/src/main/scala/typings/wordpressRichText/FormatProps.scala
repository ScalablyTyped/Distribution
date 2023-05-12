package typings.wordpressRichText

import typings.std.Record
import typings.wordpressRichText.createMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatProps extends StObject {
  
  var activeAttributes: Record[String, String]
  
  var isActive: Boolean
  
  def onChange(value: Value): Unit
  
  var value: Value
}
object FormatProps {
  
  inline def apply(activeAttributes: Record[String, String], isActive: Boolean, onChange: Value => Unit, value: Value): FormatProps = {
    val __obj = js.Dynamic.literal(activeAttributes = activeAttributes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatProps] (val x: Self) extends AnyVal {
    
    inline def setActiveAttributes(value: Record[String, String]): Self = StObject.set(x, "activeAttributes", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
