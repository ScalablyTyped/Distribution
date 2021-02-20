package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCollectionUser extends StObject {
  
  var enumValues: CollectionUser = js.native
}
object EnumValuesCollectionUser {
  
  @scala.inline
  def apply(enumValues: CollectionUser): EnumValuesCollectionUser = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCollectionUser]
  }
  
  @scala.inline
  implicit class EnumValuesCollectionUserMutableBuilder[Self <: EnumValuesCollectionUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CollectionUser): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
