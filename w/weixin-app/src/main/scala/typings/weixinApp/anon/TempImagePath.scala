package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempImagePath extends StObject {
  
  var tempImagePath: String = js.native
}
object TempImagePath {
  
  @scala.inline
  def apply(tempImagePath: String): TempImagePath = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempImagePath]
  }
  
  @scala.inline
  implicit class TempImagePathMutableBuilder[Self <: TempImagePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
  }
}
