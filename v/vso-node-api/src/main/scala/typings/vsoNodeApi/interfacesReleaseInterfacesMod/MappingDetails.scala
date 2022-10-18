package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDetails extends StObject {
  
  var mappings: StringDictionary[InputValue]
}
object MappingDetails {
  
  inline def apply(mappings: StringDictionary[InputValue]): MappingDetails = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDetails]
  }
  
  extension [Self <: MappingDetails](x: Self) {
    
    inline def setMappings(value: StringDictionary[InputValue]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
