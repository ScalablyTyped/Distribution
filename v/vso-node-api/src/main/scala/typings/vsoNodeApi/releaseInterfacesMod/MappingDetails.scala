package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.formInputInterfacesMod.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDetails extends StObject {
  
  var mappings: StringDictionary[InputValue]
}
object MappingDetails {
  
  @scala.inline
  def apply(mappings: StringDictionary[InputValue]): MappingDetails = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDetails]
  }
  
  @scala.inline
  implicit class MappingDetailsMutableBuilder[Self <: MappingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappings(value: StringDictionary[InputValue]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
