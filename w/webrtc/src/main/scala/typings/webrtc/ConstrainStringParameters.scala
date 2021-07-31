package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainStringParameters extends StObject {
  
  var exact: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ideal: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ConstrainStringParameters {
  
  @scala.inline
  def apply(): ConstrainStringParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainStringParameters]
  }
  
  @scala.inline
  implicit class ConstrainStringParametersMutableBuilder[Self <: ConstrainStringParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: String | js.Array[String]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setExactVarargs(value: String*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: String | js.Array[String]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    @scala.inline
    def setIdealVarargs(value: String*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
