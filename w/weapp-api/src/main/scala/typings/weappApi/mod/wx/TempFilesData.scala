package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempFilesData extends StObject {
  
  /** 文件的临时路径 */
  var tempFilePaths: String = js.native
}
object TempFilesData {
  
  @scala.inline
  def apply(tempFilePaths: String): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilesData]
  }
  
  @scala.inline
  implicit class TempFilesDataMutableBuilder[Self <: TempFilesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePaths(value: String): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
  }
}
