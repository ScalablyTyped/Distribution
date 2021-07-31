package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesLinksOneHopDoesNotContain extends StObject {
  
  var enumValues: LinksOneHopDoesNotContain
}
object EnumValuesLinksOneHopDoesNotContain {
  
  @scala.inline
  def apply(enumValues: LinksOneHopDoesNotContain): EnumValuesLinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLinksOneHopDoesNotContain]
  }
  
  @scala.inline
  implicit class EnumValuesLinksOneHopDoesNotContainMutableBuilder[Self <: EnumValuesLinksOneHopDoesNotContain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: LinksOneHopDoesNotContain): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
