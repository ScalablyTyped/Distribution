package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsSaveFileOptions
  extends StObject
     with SaveFileOptions {
  
  var filePath: String
}
object FsSaveFileOptions {
  
  inline def apply(filePath: String, tempFilePath: String): FsSaveFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsSaveFileOptions]
  }
  
  extension [Self <: FsSaveFileOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
