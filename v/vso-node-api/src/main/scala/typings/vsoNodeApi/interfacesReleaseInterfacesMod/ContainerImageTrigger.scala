package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerImageTrigger
  extends StObject
     with ReleaseTriggerBase {
  
  var alias: String
}
object ContainerImageTrigger {
  
  inline def apply(alias: String, triggerType: ReleaseTriggerType): ContainerImageTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImageTrigger]
  }
  
  extension [Self <: ContainerImageTrigger](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
