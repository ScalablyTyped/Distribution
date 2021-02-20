package typings.vegaUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fields extends StObject {
    
    var fields: js.Array[String] = js.native
    
    var fname: js.UndefOr[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(fields: js.Array[String]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnameUndefined: Self = StObject.set(x, "fname", js.undefined)
    }
  }
}
