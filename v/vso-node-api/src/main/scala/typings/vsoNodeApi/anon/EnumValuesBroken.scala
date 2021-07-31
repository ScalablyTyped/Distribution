package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBroken extends StObject {
  
  var enumValues: Broken
}
object EnumValuesBroken {
  
  @scala.inline
  def apply(enumValues: Broken): EnumValuesBroken = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBroken]
  }
  
  @scala.inline
  implicit class EnumValuesBrokenMutableBuilder[Self <: EnumValuesBroken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Broken): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
