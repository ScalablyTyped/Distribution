package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFolderAscending extends StObject {
  
  var enumValues: FolderAscending
}
object EnumValuesFolderAscending {
  
  inline def apply(enumValues: FolderAscending): EnumValuesFolderAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFolderAscending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesFolderAscending] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: FolderAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
