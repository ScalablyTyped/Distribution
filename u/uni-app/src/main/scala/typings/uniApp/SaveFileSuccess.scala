package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileSuccess extends StObject {
  
  /**
    * 文件的保存路径
    */
  var savedFilePath: js.UndefOr[String] = js.undefined
}
object SaveFileSuccess {
  
  inline def apply(): SaveFileSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveFileSuccess]
  }
  
  extension [Self <: SaveFileSuccess](x: Self) {
    
    inline def setSavedFilePath(value: String): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
    
    inline def setSavedFilePathUndefined: Self = StObject.set(x, "savedFilePath", js.undefined)
  }
}
