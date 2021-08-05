package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var filePath: String
}
object UnlinkOptions {
  
  inline def apply(filePath: String): UnlinkOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkOptions]
  }
  
  extension [Self <: UnlinkOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
