package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseTriggerBase extends StObject {
  
  var triggerType: ReleaseTriggerType = js.native
}
object ReleaseTriggerBase {
  
  @scala.inline
  def apply(triggerType: ReleaseTriggerType): ReleaseTriggerBase = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTriggerBase]
  }
  
  @scala.inline
  implicit class ReleaseTriggerBaseMutableBuilder[Self <: ReleaseTriggerBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerType(value: ReleaseTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
