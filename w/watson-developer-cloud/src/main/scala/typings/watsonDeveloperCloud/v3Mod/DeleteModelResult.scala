package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** DeleteModelResult. */
@js.native
trait DeleteModelResult extends StObject {
  
  /** "OK" indicates that the model was successfully deleted. */
  var status: String = js.native
}
object DeleteModelResult {
  
  @scala.inline
  def apply(status: String): DeleteModelResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelResult]
  }
  
  @scala.inline
  implicit class DeleteModelResultMutableBuilder[Self <: DeleteModelResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
