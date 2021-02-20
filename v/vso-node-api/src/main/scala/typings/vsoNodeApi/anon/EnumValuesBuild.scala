package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBuild extends StObject {
  
  var enumValues: Build = js.native
}
object EnumValuesBuild {
  
  @scala.inline
  def apply(enumValues: Build): EnumValuesBuild = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBuild]
  }
  
  @scala.inline
  implicit class EnumValuesBuildMutableBuilder[Self <: EnumValuesBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Build): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
