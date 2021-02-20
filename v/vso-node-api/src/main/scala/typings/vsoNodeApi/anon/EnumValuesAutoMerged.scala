package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAutoMerged extends StObject {
  
  var enumValues: AutoMerged = js.native
}
object EnumValuesAutoMerged {
  
  @scala.inline
  def apply(enumValues: AutoMerged): EnumValuesAutoMerged = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutoMerged]
  }
  
  @scala.inline
  implicit class EnumValuesAutoMergedMutableBuilder[Self <: EnumValuesAutoMerged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AutoMerged): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
