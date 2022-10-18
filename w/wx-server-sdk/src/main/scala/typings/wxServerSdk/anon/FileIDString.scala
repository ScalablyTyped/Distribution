package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileIDString extends StObject {
  
  var fileID: String
}
object FileIDString {
  
  inline def apply(fileID: String): FileIDString = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIDString]
  }
  
  extension [Self <: FileIDString](x: Self) {
    
    inline def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
  }
}
