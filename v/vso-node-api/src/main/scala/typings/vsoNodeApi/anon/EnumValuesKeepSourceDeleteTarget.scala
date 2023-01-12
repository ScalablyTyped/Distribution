package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesKeepSourceDeleteTarget extends StObject {
  
  var enumValues: KeepSourceDeleteTarget
}
object EnumValuesKeepSourceDeleteTarget {
  
  inline def apply(enumValues: KeepSourceDeleteTarget): EnumValuesKeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesKeepSourceDeleteTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesKeepSourceDeleteTarget] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: KeepSourceDeleteTarget): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
