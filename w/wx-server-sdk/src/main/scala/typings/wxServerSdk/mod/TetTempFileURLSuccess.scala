package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.FileID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TetTempFileURLSuccess extends StObject {
  
  var fileList: js.Array[FileID]
}
object TetTempFileURLSuccess {
  
  inline def apply(fileList: js.Array[FileID]): TetTempFileURLSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetTempFileURLSuccess]
  }
  
  extension [Self <: TetTempFileURLSuccess](x: Self) {
    
    inline def setFileList(value: js.Array[FileID]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: FileID*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
