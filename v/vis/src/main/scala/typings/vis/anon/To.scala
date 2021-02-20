package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait To extends StObject {
  
  var from: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[Double] = js.native
}
object To {
  
  @scala.inline
  def apply(): To = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit class ToMutableBuilder[Self <: To] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
