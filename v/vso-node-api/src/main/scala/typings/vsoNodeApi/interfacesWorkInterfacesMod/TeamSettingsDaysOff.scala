package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSettingsDaysOff
  extends StObject
     with TeamSettingsDataContractBase {
  
  var daysOff: js.Array[DateRange]
}
object TeamSettingsDaysOff {
  
  inline def apply(_links: Any, daysOff: js.Array[DateRange], url: String): TeamSettingsDaysOff = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDaysOff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamSettingsDaysOff] (val x: Self) extends AnyVal {
    
    inline def setDaysOff(value: js.Array[DateRange]): Self = StObject.set(x, "daysOff", value.asInstanceOf[js.Any])
    
    inline def setDaysOffVarargs(value: DateRange*): Self = StObject.set(x, "daysOff", js.Array(value*))
  }
}
