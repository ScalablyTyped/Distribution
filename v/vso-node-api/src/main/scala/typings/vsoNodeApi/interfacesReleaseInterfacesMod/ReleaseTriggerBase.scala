package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseTriggerBase extends StObject {
  
  var triggerType: ReleaseTriggerType
}
object ReleaseTriggerBase {
  
  inline def apply(triggerType: ReleaseTriggerType): ReleaseTriggerBase = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTriggerBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseTriggerBase] (val x: Self) extends AnyVal {
    
    inline def setTriggerType(value: ReleaseTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
