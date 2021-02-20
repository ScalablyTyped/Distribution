package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempFilePath extends StObject {
  
  var tempFilePath: String = js.native
}
object TempFilePath {
  
  @scala.inline
  def apply(tempFilePath: String): TempFilePath = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePath]
  }
  
  @scala.inline
  implicit class TempFilePathMutableBuilder[Self <: TempFilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
