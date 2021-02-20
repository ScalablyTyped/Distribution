package typings.tinder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait String extends StObject {
    
    var string: java.lang.String = js.native
  }
  object String {
    
    @scala.inline
    def apply(string: java.lang.String): String = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
    
    @scala.inline
    implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
