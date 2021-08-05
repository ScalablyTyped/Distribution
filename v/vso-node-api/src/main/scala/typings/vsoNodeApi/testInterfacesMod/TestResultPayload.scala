package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultPayload extends StObject {
  
  var comment: String
  
  var name: String
  
  var stream: String
}
object TestResultPayload {
  
  inline def apply(comment: String, name: String, stream: String): TestResultPayload = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultPayload]
  }
  
  extension [Self <: TestResultPayload](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
