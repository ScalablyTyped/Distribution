package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesOffline extends StObject {
  
  var enumValues: Offline
}
object EnumValuesOffline {
  
  @scala.inline
  def apply(enumValues: Offline): EnumValuesOffline = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOffline]
  }
  
  @scala.inline
  implicit class EnumValuesOfflineMutableBuilder[Self <: EnumValuesOffline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Offline): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
