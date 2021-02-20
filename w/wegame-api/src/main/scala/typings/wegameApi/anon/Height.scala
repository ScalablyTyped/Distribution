package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends StObject {
  
  /**
    * 图片高度
    */
  var height: String = js.native
  
  /**
    * 临时图片路径
    */
  var tempImagePath: String = js.native
  
  /**
    * 图片宽度
    */
  var width: String = js.native
}
object Height {
  
  @scala.inline
  def apply(height: String, tempImagePath: String, width: String): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], tempImagePath = tempImagePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
