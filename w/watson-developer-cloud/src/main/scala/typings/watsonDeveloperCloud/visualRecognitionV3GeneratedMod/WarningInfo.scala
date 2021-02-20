package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about something that went wrong. */
@js.native
trait WarningInfo extends StObject {
  
  /** Information about the error. */
  var description: String = js.native
  
  /** Codified warning string, such as `limit_reached`. */
  var warning_id: String = js.native
}
object WarningInfo {
  
  @scala.inline
  def apply(description: String, warning_id: String): WarningInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], warning_id = warning_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningInfo]
  }
  
  @scala.inline
  implicit class WarningInfoMutableBuilder[Self <: WarningInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning_id(value: String): Self = StObject.set(x, "warning_id", value.asInstanceOf[js.Any])
  }
}
