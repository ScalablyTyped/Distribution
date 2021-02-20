package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFolder extends StObject {
  
  var enumValues: Folder = js.native
}
object EnumValuesFolder {
  
  @scala.inline
  def apply(enumValues: Folder): EnumValuesFolder = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFolder]
  }
  
  @scala.inline
  implicit class EnumValuesFolderMutableBuilder[Self <: EnumValuesFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Folder): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
