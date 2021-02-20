package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectValue
  extends Node
     with Value {
  
  var fields: js.Array[ObjectField] = js.native
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
}
object ObjectValue {
  
  @scala.inline
  def apply(fields: js.Array[ObjectField], kind: String): ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
  
  @scala.inline
  implicit class ObjectValueMutableBuilder[Self <: ObjectValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[ObjectField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ObjectField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
