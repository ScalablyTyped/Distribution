package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSuccess extends StObject {
  
  var fileList: js.Array[Status]
}
object DeleteFileSuccess {
  
  inline def apply(fileList: js.Array[Status]): DeleteFileSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileSuccess] (val x: Self) extends AnyVal {
    
    inline def setFileList(value: js.Array[Status]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: Status*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
