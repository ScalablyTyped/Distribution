package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeFields extends StObject {
  
  var includeFields: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object IncludeFields {
  
  @scala.inline
  def apply(includeFields: scala.Double, none: scala.Double): IncludeFields = {
    val __obj = js.Dynamic.literal(includeFields = includeFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeFields]
  }
  
  @scala.inline
  implicit class IncludeFieldsMutableBuilder[Self <: IncludeFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeFields(value: scala.Double): Self = StObject.set(x, "includeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
