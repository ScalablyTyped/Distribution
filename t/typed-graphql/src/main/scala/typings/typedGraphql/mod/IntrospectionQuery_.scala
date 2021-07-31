package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionQuery_ extends StObject {
  
  var __schema: IntrospectionSchema
}
object IntrospectionQuery_ {
  
  @scala.inline
  def apply(__schema: IntrospectionSchema): IntrospectionQuery_ = {
    val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionQuery_]
  }
  
  @scala.inline
  implicit class IntrospectionQuery_MutableBuilder[Self <: IntrospectionQuery_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__schema(value: IntrospectionSchema): Self = StObject.set(x, "__schema", value.asInstanceOf[js.Any])
  }
}
