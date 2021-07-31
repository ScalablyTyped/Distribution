package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceObject
  extends StObject
     with Response {
  
  @JSName("$ref")
  var $ref: String
}
object ReferenceObject {
  
  @scala.inline
  def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
  
  @scala.inline
  implicit class ReferenceObjectMutableBuilder[Self <: ReferenceObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
