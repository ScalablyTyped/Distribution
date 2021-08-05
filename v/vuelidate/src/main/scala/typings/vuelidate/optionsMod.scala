package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vueMod.Vue
import typings.vuelidate.validatorsMod.ValidationRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait AsyncDecl extends StObject {
    
    def apply(args: js.Any*): Boolean | js.Promise[Boolean] = js.native
  }
  
  trait ComponentOptions[V /* <: Vue */] extends StObject {
    
    var validations: js.UndefOr[RuleDecl | DynamicDecl] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    extension [Self <: ComponentOptions[?], V /* <: Vue */](x: Self & ComponentOptions[V]) {
      
      inline def setValidations(value: RuleDecl | DynamicDecl): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      inline def setValidationsFunction0(value: () => RuleDecl): Self = StObject.set(x, "validations", js.Any.fromFunction0(value))
      
      inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    }
  }
  
  type DynamicDecl = js.Function0[RuleDecl]
  
  type GroupDecl = js.Array[String]
  
  type NestedDecl = RuleDecl
  
  trait RuleDecl
    extends StObject
       with /* rule */ StringDictionary[ValidationDecl | GroupDecl | AsyncDecl | NestedDecl]
  object RuleDecl {
    
    inline def apply(): RuleDecl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleDecl]
    }
  }
  
  type ValidGroupDecl = StringDictionary[js.Array[String]]
  
  type ValidPropertyDecl = StringDictionary[RuleDecl]
  
  type ValidationDecl = ValidationRule | (js.Function1[/* repeated */ js.Any, ValidationRule])
}
