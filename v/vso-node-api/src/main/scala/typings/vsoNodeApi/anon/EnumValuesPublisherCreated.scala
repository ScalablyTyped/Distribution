package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPublisherCreated extends StObject {
  
  var enumValues: PublisherCreated
}
object EnumValuesPublisherCreated {
  
  inline def apply(enumValues: PublisherCreated): EnumValuesPublisherCreated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPublisherCreated]
  }
  
  extension [Self <: EnumValuesPublisherCreated](x: Self) {
    
    inline def setEnumValues(value: PublisherCreated): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
