package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseResultAttachmentModel extends StObject {
  
  var id: Double
  
  var iterationId: Double
  
  var name: String
  
  var size: Double
  
  var url: String
}
object TestCaseResultAttachmentModel {
  
  inline def apply(id: Double, iterationId: Double, name: String, size: Double, url: String): TestCaseResultAttachmentModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultAttachmentModel]
  }
  
  extension [Self <: TestCaseResultAttachmentModel](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
