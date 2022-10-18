package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTransformationDetails extends StObject {
  
  var resultTemplate: String
}
object ResultTransformationDetails {
  
  inline def apply(resultTemplate: String): ResultTransformationDetails = {
    val __obj = js.Dynamic.literal(resultTemplate = resultTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultTransformationDetails]
  }
  
  extension [Self <: ResultTransformationDetails](x: Self) {
    
    inline def setResultTemplate(value: String): Self = StObject.set(x, "resultTemplate", value.asInstanceOf[js.Any])
  }
}
