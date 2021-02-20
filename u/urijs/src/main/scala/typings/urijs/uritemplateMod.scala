package typings.urijs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.urijs.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uritemplateMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("urijs/src/URITemplate", JSImport.Namespace)
  @js.native
  class ^ protected () extends URITemplate {
    def this(template: String) = this()
  }
  @JSImport("urijs/src/URITemplate", JSImport.Namespace)
  @js.native
  val ^ : URITemplateStatic = js.native
  
  @js.native
  trait URITemplate extends StObject {
    
    def expand(data: URITemplateInput): URI = js.native
    def expand(data: URITemplateInput, opts: js.Object): URI = js.native
    
    def parse(): this.type = js.native
    
    /**
      * @description The parsed parts of the URI Template. Only present after calling
      *              `parse()` first.
      */
    var parts: js.UndefOr[js.Array[URITemplatePart]] = js.native
  }
  
  type URITemplateCallback = js.Function1[/* keyName */ String, URITemplateValue]
  
  @js.native
  trait URITemplateExpression extends StObject {
    
    var expression: String = js.native
    
    var operator: String = js.native
    
    var variables: js.Array[URITemplateVariable] = js.native
  }
  object URITemplateExpression {
    
    @scala.inline
    def apply(expression: String, operator: String, variables: js.Array[URITemplateVariable]): URITemplateExpression = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[URITemplateExpression]
    }
    
    @scala.inline
    implicit class URITemplateExpressionMutableBuilder[Self <: URITemplateExpression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: js.Array[URITemplateVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesVarargs(value: URITemplateVariable*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
  
  type URITemplateInput = (StringDictionary[URITemplateValue | URITemplateCallback]) | URITemplateCallback
  
  type URITemplateLiteral = String
  
  type URITemplatePart = URITemplateLiteral | URITemplateExpression
  
  @js.native
  trait URITemplateStatic extends Instantiable1[/* template */ String, URITemplate] {
    
    def apply(template: String): URITemplate = js.native
  }
  
  type URITemplateValue = js.UndefOr[String | js.Array[String] | StringDictionary[String] | Null]
  
  @js.native
  trait URITemplateVariable extends StObject {
    
    var explode: Boolean = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var name: String = js.native
  }
  object URITemplateVariable {
    
    @scala.inline
    def apply(explode: Boolean, name: String): URITemplateVariable = {
      val __obj = js.Dynamic.literal(explode = explode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[URITemplateVariable]
    }
    
    @scala.inline
    implicit class URITemplateVariableMutableBuilder[Self <: URITemplateVariable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = URITemplateStatic
  
  /* This means you don't have to write `^`, but can instead just say `uritemplateMod.foo` */
  override def _to: URITemplateStatic = ^
}
