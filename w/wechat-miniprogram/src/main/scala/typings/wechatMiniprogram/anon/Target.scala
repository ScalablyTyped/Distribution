package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  var target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject] = js.native
}
object Target {
  
  @scala.inline
  def apply(target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
