package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCommit extends StObject {
  
  var enumValues: Commit
}
object EnumValuesCommit {
  
  inline def apply(enumValues: Commit): EnumValuesCommit = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCommit] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Commit): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
