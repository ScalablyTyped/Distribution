package typings.wicgFileSystemAccess.mod.global

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePickerAcceptType extends StObject {
  
  var accept: Record[String, String | js.Array[String]]
  
  var description: js.UndefOr[String] = js.undefined
}
object FilePickerAcceptType {
  
  inline def apply(accept: Record[String, String | js.Array[String]]): FilePickerAcceptType = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerAcceptType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePickerAcceptType] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
