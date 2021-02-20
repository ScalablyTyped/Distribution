package typings.unityWebapi

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnityIndicatorProperties extends StObject {
  
  var count: Double = js.native
  
  var iconURI: String = js.native
  
  var onIndicatorActivated: js.Function = js.native
  
  var time: Date = js.native
}
object UnityIndicatorProperties {
  
  @scala.inline
  def apply(count: Double, iconURI: String, onIndicatorActivated: js.Function, time: Date): UnityIndicatorProperties = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], iconURI = iconURI.asInstanceOf[js.Any], onIndicatorActivated = onIndicatorActivated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityIndicatorProperties]
  }
  
  @scala.inline
  implicit class UnityIndicatorPropertiesMutableBuilder[Self <: UnityIndicatorProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURI(value: String): Self = StObject.set(x, "iconURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIndicatorActivated(value: js.Function): Self = StObject.set(x, "onIndicatorActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
