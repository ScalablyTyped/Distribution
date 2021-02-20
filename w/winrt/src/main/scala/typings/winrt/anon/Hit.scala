package typings.winrt.anon

import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hit extends StObject {
  
  var hit: Double = js.native
  
  var rect: Rect = js.native
}
object Hit {
  
  @scala.inline
  def apply(hit: Double, rect: Rect): Hit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  
  @scala.inline
  implicit class HitMutableBuilder[Self <: Hit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHit(value: Double): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
