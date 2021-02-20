package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesDecay extends StObject {
  
  var properties: Decay = js.native
  
  var value: js.Array[_] = js.native
}
object PropertiesDecay {
  
  @scala.inline
  def apply(properties: Decay, value: js.Array[_]): PropertiesDecay = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDecay]
  }
  
  @scala.inline
  implicit class PropertiesDecayMutableBuilder[Self <: PropertiesDecay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Decay): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
