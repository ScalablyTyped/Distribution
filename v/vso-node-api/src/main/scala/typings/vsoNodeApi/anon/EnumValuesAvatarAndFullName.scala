package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAvatarAndFullName extends StObject {
  
  var enumValues: AvatarAndFullName
}
object EnumValuesAvatarAndFullName {
  
  inline def apply(enumValues: AvatarAndFullName): EnumValuesAvatarAndFullName = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAvatarAndFullName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAvatarAndFullName] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AvatarAndFullName): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
