package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCollectionUser extends StObject {
  
  var enumValues: CollectionUser
}
object EnumValuesCollectionUser {
  
  inline def apply(enumValues: CollectionUser): EnumValuesCollectionUser = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCollectionUser]
  }
  
  extension [Self <: EnumValuesCollectionUser](x: Self) {
    
    inline def setEnumValues(value: CollectionUser): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
