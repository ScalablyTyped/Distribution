package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultPayload extends StObject {
  
  var comment: String = js.native
  
  var name: String = js.native
  
  var stream: String = js.native
}
object TestResultPayload {
  
  @scala.inline
  def apply(comment: String, name: String, stream: String): TestResultPayload = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultPayload]
  }
  
  @scala.inline
  implicit class TestResultPayloadMutableBuilder[Self <: TestResultPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
