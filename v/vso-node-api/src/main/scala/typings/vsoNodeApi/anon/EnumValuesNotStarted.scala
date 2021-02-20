package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesNotStarted extends StObject {
  
  var enumValues: NotStarted = js.native
}
object EnumValuesNotStarted {
  
  @scala.inline
  def apply(enumValues: NotStarted): EnumValuesNotStarted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotStarted]
  }
  
  @scala.inline
  implicit class EnumValuesNotStartedMutableBuilder[Self <: EnumValuesNotStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: NotStarted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
