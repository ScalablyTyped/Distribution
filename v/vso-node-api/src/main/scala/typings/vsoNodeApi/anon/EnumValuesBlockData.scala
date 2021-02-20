package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBlockData extends StObject {
  
  var enumValues: BlockData = js.native
}
object EnumValuesBlockData {
  
  @scala.inline
  def apply(enumValues: BlockData): EnumValuesBlockData = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBlockData]
  }
  
  @scala.inline
  implicit class EnumValuesBlockDataMutableBuilder[Self <: EnumValuesBlockData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: BlockData): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
