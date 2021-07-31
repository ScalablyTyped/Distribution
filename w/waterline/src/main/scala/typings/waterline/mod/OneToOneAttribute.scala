package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneToOneAttribute
  extends StObject
     with BaseAttribute[js.Any]
     with _Attribute {
  
  var model: String
}
object OneToOneAttribute {
  
  @scala.inline
  def apply(model: String): OneToOneAttribute = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneToOneAttribute]
  }
  
  @scala.inline
  implicit class OneToOneAttributeMutableBuilder[Self <: OneToOneAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
