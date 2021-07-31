package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIterations extends StObject {
  
  var enumValues: Iterations
}
object EnumValuesIterations {
  
  @scala.inline
  def apply(enumValues: Iterations): EnumValuesIterations = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIterations]
  }
  
  @scala.inline
  implicit class EnumValuesIterationsMutableBuilder[Self <: EnumValuesIterations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Iterations): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
