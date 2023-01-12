package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInformation extends StObject {
  
  var byteOrderMark: ByteOrderMark
  
  var contents: String
}
object FileInformation {
  
  inline def apply(byteOrderMark: ByteOrderMark, contents: String): FileInformation = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileInformation] (val x: Self) extends AnyVal {
    
    inline def setByteOrderMark(value: ByteOrderMark): Self = StObject.set(x, "byteOrderMark", value.asInstanceOf[js.Any])
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
  }
}
