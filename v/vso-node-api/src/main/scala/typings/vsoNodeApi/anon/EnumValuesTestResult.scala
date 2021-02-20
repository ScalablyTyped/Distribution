package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesTestResult extends StObject {
  
  var enumValues: TestResult = js.native
}
object EnumValuesTestResult {
  
  @scala.inline
  def apply(enumValues: TestResult): EnumValuesTestResult = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTestResult]
  }
  
  @scala.inline
  implicit class EnumValuesTestResultMutableBuilder[Self <: EnumValuesTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: TestResult): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
