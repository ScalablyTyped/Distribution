package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotate extends StObject {
  
  /** 旋转程度，最低基础库 2.3.0 */
  var rotate: Double = js.native
  
  /** 缩放程度，最低基础库 2.3.0 */
  var skew: Double = js.native
}
object Rotate {
  
  @scala.inline
  def apply(rotate: Double, skew: Double): Rotate = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotate]
  }
  
  @scala.inline
  implicit class RotateMutableBuilder[Self <: Rotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
  }
}
