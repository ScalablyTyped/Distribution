package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempThumbPath extends StObject {
  
  /**
    * 临时视频路径
    */
  var tempThumbPath: String
  
  /**
    * 临时封面路径
    */
  var tempVideoPath: String
}
object TempThumbPath {
  
  inline def apply(tempThumbPath: String, tempVideoPath: String): TempThumbPath = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempThumbPath]
  }
  
  extension [Self <: TempThumbPath](x: Self) {
    
    inline def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
    
    inline def setTempVideoPath(value: String): Self = StObject.set(x, "tempVideoPath", value.asInstanceOf[js.Any])
  }
}
