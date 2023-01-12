package typings.weixinApp.anon

import typings.weixinApp.weixinAppInts.`-90`
import typings.weixinApp.weixinAppInts.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: typings.weixinApp.weixinAppInts.`0` | `90` | `-90`
}
object Direction {
  
  inline def apply(direction: typings.weixinApp.weixinAppInts.`0` | `90` | `-90`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: typings.weixinApp.weixinAppInts.`0` | `90` | `-90`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
