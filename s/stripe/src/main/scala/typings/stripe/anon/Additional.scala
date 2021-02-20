package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Additional extends StObject {
  
  var additional: js.Array[String] = js.native
  
  var minimum: js.Array[String] = js.native
}
object Additional {
  
  @scala.inline
  def apply(additional: js.Array[String], minimum: js.Array[String]): Additional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additional]
  }
  
  @scala.inline
  implicit class AdditionalMutableBuilder[Self <: Additional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional(value: js.Array[String]): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalVarargs(value: String*): Self = StObject.set(x, "additional", js.Array(value :_*))
    
    @scala.inline
    def setMinimum(value: js.Array[String]): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVarargs(value: String*): Self = StObject.set(x, "minimum", js.Array(value :_*))
  }
}
