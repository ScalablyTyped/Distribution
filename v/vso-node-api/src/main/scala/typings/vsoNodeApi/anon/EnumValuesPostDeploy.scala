package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPostDeploy extends StObject {
  
  var enumValues: PostDeploy
}
object EnumValuesPostDeploy {
  
  inline def apply(enumValues: PostDeploy): EnumValuesPostDeploy = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPostDeploy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesPostDeploy] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: PostDeploy): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
