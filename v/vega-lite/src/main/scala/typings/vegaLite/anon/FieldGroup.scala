package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldGroup extends StObject {
  
  var field: Group = js.native
}
object FieldGroup {
  
  @scala.inline
  def apply(field: Group): FieldGroup = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldGroup]
  }
  
  @scala.inline
  implicit class FieldGroupMutableBuilder[Self <: FieldGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: Group): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
