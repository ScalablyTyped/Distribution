package typings.vis.anon

import typings.vis.mod.ArrowHead
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends StObject {
  
  var from: js.UndefOr[Boolean | ArrowHead] = js.native
  
  var middle: js.UndefOr[Boolean | ArrowHead] = js.native
  
  var to: js.UndefOr[Boolean | ArrowHead] = js.native
}
object From {
  
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Boolean | ArrowHead): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMiddle(value: Boolean | ArrowHead): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    @scala.inline
    def setTo(value: Boolean | ArrowHead): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
