package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autokeep extends StObject {
  
  var auto_keep: Boolean = js.native
  
  var error_rate: Boolean = js.native
  
  var event_count: Boolean = js.native
  
  var performance: Boolean = js.native
  
  var prefailure: Boolean = js.native
  
  var string: java.lang.String = js.native
  
  var updated_online: Boolean = js.native
  
  var value: Double = js.native
}
object Autokeep {
  
  @scala.inline
  def apply(
    auto_keep: Boolean,
    error_rate: Boolean,
    event_count: Boolean,
    performance: Boolean,
    prefailure: Boolean,
    string: java.lang.String,
    updated_online: Boolean,
    value: Double
  ): Autokeep = {
    val __obj = js.Dynamic.literal(auto_keep = auto_keep.asInstanceOf[js.Any], error_rate = error_rate.asInstanceOf[js.Any], event_count = event_count.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], prefailure = prefailure.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], updated_online = updated_online.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autokeep]
  }
  
  @scala.inline
  implicit class AutokeepMutableBuilder[Self <: Autokeep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_keep(value: Boolean): Self = StObject.set(x, "auto_keep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_rate(value: Boolean): Self = StObject.set(x, "error_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_count(value: Boolean): Self = StObject.set(x, "event_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefailure(value: Boolean): Self = StObject.set(x, "prefailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_online(value: Boolean): Self = StObject.set(x, "updated_online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
