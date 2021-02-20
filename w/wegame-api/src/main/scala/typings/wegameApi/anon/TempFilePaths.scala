package typings.wegameApi.anon

import typings.wegameApi.ImageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempFilePaths extends StObject {
  
  var tempFilePaths: js.Array[String] = js.native
  
  var tempFiles: js.Array[ImageFile] = js.native
}
object TempFilePaths {
  
  @scala.inline
  def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): TempFilePaths = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePaths]
  }
  
  @scala.inline
  implicit class TempFilePathsMutableBuilder[Self <: TempFilePaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePaths(value: js.Array[String]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathsVarargs(value: String*): Self = StObject.set(x, "tempFilePaths", js.Array(value :_*))
    
    @scala.inline
    def setTempFiles(value: js.Array[ImageFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilesVarargs(value: ImageFile*): Self = StObject.set(x, "tempFiles", js.Array(value :_*))
  }
}
