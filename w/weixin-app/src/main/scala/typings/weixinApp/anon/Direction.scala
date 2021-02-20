package typings.weixinApp.anon

import typings.weixinApp.weixinAppNumbers.`-90`
import typings.weixinApp.weixinAppNumbers.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90` = js.native
}
object Direction {
  
  @scala.inline
  def apply(direction: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
