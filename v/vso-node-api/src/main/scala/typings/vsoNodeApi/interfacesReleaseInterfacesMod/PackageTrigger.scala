package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageTrigger
  extends StObject
     with ReleaseTriggerBase {
  
  var alias: String
}
object PackageTrigger {
  
  inline def apply(alias: String, triggerType: ReleaseTriggerType): PackageTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageTrigger]
  }
  
  extension [Self <: PackageTrigger](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
