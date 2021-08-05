package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.bottom
import typings.wechatMiniprogram.wechatMiniprogramStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var direction: bottom | right
}
object `0` {
  
  inline def apply(direction: bottom | right): `0` = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setDirection(value: bottom | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
