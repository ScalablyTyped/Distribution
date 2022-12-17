package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TetTempFileURLSuccess extends StObject {
  
  var fileList: js.Array[ErrMsg]
}
object TetTempFileURLSuccess {
  
  inline def apply(fileList: js.Array[ErrMsg]): TetTempFileURLSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetTempFileURLSuccess]
  }
  
  extension [Self <: TetTempFileURLSuccess](x: Self) {
    
    inline def setFileList(value: js.Array[ErrMsg]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: ErrMsg*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
