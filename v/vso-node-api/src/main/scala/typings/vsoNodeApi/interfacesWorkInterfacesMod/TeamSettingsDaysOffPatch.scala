package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSettingsDaysOffPatch extends StObject {
  
  var daysOff: js.Array[DateRange]
}
object TeamSettingsDaysOffPatch {
  
  inline def apply(daysOff: js.Array[DateRange]): TeamSettingsDaysOffPatch = {
    val __obj = js.Dynamic.literal(daysOff = daysOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDaysOffPatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamSettingsDaysOffPatch] (val x: Self) extends AnyVal {
    
    inline def setDaysOff(value: js.Array[DateRange]): Self = StObject.set(x, "daysOff", value.asInstanceOf[js.Any])
    
    inline def setDaysOffVarargs(value: DateRange*): Self = StObject.set(x, "daysOff", js.Array(value*))
  }
}
