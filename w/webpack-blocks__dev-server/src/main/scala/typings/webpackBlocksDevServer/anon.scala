package typings.webpackBlocksDevServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object Errors {
    
    @scala.inline
    def apply(): Errors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  trait String extends StObject {
    
    var string: js.Array[java.lang.String]
  }
  object String {
    
    @scala.inline
    def apply(string: js.Array[java.lang.String]): String = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
    
    @scala.inline
    implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setString(value: js.Array[java.lang.String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringVarargs(value: java.lang.String*): Self = StObject.set(x, "string", js.Array(value :_*))
    }
  }
}
