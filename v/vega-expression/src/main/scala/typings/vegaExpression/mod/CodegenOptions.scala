package typings.vegaExpression.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodegenOptions extends js.Object {
  
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
  implicit class CodegenOptionsOps[Self <: CodegenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobalvarFunction1(value: /* id */ String => String): Self = this.set("globalvar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGlobalvar(value: String | (js.Function1[/* id */ String, String])): Self = this.set("globalvar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedVarargs(value: String*): Self = this.set("allowed", js.Array(value :_*))
    
    @scala.inline
    def setAllowed(value: js.Array[String]): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setConstants(value: StringDictionary[String]): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstants: Self = this.set("constants", js.undefined)
    
    @scala.inline
    def setFieldvar(value: String): Self = this.set("fieldvar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldvar: Self = this.set("fieldvar", js.undefined)
    
    @scala.inline
    def setForbiddenVarargs(value: String*): Self = this.set("forbidden", js.Array(value :_*))
    
    @scala.inline
    def setForbidden(value: js.Array[String]): Self = this.set("forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbidden: Self = this.set("forbidden", js.undefined)
    
    @scala.inline
    def setFunctions(value: /* astVisitor */ js.Any => StringDictionary[String | (js.Function1[/* args */ _, String])]): Self = this.set("functions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
  }
}
