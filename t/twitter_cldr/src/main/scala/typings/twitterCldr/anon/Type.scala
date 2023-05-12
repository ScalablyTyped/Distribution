package typings.twitterCldr.anon

import typings.twitterCldr.twitterCldrStrings.additional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var format: additional
  
  var `type`: String
}
object Type {
  
  inline def apply(`type`: String): Type = {
    val __obj = js.Dynamic.literal(format = "additional")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: additional): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
