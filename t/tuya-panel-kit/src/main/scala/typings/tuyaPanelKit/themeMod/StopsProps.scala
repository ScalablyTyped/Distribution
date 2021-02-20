package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopsProps extends StObject {
  
  var offset: String = js.native
  
  var stopColor: String = js.native
  
  var stopOpacity: String = js.native
}
object StopsProps {
  
  @scala.inline
  def apply(offset: String, stopColor: String, stopOpacity: String): StopsProps = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stopColor = stopColor.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopsProps]
  }
  
  @scala.inline
  implicit class StopsPropsMutableBuilder[Self <: StopsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
  }
}
