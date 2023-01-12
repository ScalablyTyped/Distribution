package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 打开的文件信息数组，只有从聊天素材场景打开（scene为1173）才会携带该参数 */
trait ForwardMaterials extends StObject {
  
  /** 文件名 */
  var name: String
  
  /** 文件路径（如果是webview则是url） */
  var path: String
  
  /** 文件大小 */
  var size: Double
  
  /** 文件的mimetype类型 */
  var `type`: String
}
object ForwardMaterials {
  
  inline def apply(name: String, path: String, size: Double, `type`: String): ForwardMaterials = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardMaterials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardMaterials] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
