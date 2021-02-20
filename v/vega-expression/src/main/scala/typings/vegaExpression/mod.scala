package typings.vegaExpression

import org.scalablytyped.runtime.StringDictionary
import typings.vegaExpression.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-expression", "ASTNode")
  @js.native
  def ASTNode(`type`: String): Unit = js.native
  
  @JSImport("vega-expression", "codegen")
  @js.native
  def codegen(options: CodegenOptions): js.Function1[/* ast */ js.Any, Code] = js.native
  
  @JSImport("vega-expression", "functions")
  @js.native
  def functions(codegen: js.Any): StringDictionary[String | js.Function0[String]] = js.native
  
  @JSImport("vega-expression", "parse")
  @js.native
  def parse(expression: String): js.Any = js.native
  
  @js.native
  trait CodegenOptions extends StObject {
    
    /** An array of variable names that may be referenced within the expression scope */
    var allowed: js.UndefOr[js.Array[String]] = js.native
    
    /** A hash of allowed top-level constant values */
    var constants: js.UndefOr[StringDictionary[String]] = js.native
    
    /** The name of the primary data input argument within the generated expression function */
    var fieldvar: js.UndefOr[String] = js.native
    
    /** An array of variable names that may not be referenced within the expression scope */
    var forbidden: js.UndefOr[js.Array[String]] = js.native
    
    /** A function that is given an AST visitor instance as input and returns an object of allowed functions */
    var functions: js.UndefOr[
        js.Function1[
          /* astVisitor */ js.Any, 
          StringDictionary[String | (js.Function1[/* args */ _, String])]
        ]
      ] = js.native
    
    /** The name of the variable upon which to lookup global variables */
    var globalvar: String | (js.Function1[/* id */ String, String]) = js.native
  }
  object CodegenOptions {
    
    @scala.inline
    def apply(globalvar: String | (js.Function1[/* id */ String, String])): CodegenOptions = {
      val __obj = js.Dynamic.literal(globalvar = globalvar.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodegenOptions]
    }
    
    @scala.inline
    implicit class CodegenOptionsMutableBuilder[Self <: CodegenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      @scala.inline
      def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value :_*))
      
      @scala.inline
      def setConstants(value: StringDictionary[String]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
      
      @scala.inline
      def setFieldvar(value: String): Self = StObject.set(x, "fieldvar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldvarUndefined: Self = StObject.set(x, "fieldvar", js.undefined)
      
      @scala.inline
      def setForbidden(value: js.Array[String]): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
      
      @scala.inline
      def setForbiddenVarargs(value: String*): Self = StObject.set(x, "forbidden", js.Array(value :_*))
      
      @scala.inline
      def setFunctions(value: /* astVisitor */ js.Any => StringDictionary[String | (js.Function1[/* args */ _, String])]): Self = StObject.set(x, "functions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setGlobalvar(value: String | (js.Function1[/* id */ String, String])): Self = StObject.set(x, "globalvar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalvarFunction1(value: /* id */ String => String): Self = StObject.set(x, "globalvar", js.Any.fromFunction1(value))
    }
  }
}
