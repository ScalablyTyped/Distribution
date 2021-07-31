package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesManage extends StObject {
  
  var enumValues: Manage
}
object EnumValuesManage {
  
  @scala.inline
  def apply(enumValues: Manage): EnumValuesManage = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesManage]
  }
  
  @scala.inline
  implicit class EnumValuesManageMutableBuilder[Self <: EnumValuesManage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Manage): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
