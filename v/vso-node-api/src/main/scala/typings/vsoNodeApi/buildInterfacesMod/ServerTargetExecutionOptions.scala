package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerTargetExecutionOptions extends StObject {
  
  /**
    * The type.
    */
  var `type`: Double = js.native
}
object ServerTargetExecutionOptions {
  
  @scala.inline
  def apply(`type`: Double): ServerTargetExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTargetExecutionOptions]
  }
  
  @scala.inline
  implicit class ServerTargetExecutionOptionsMutableBuilder[Self <: ServerTargetExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
