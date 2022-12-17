package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import typings.vuelidate.libValidatorsMod.ValidationRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueTypesOptionsMod {
  
  @js.native
  trait AsyncDecl extends StObject {
    
    def apply(args: Any*): Boolean | js.Promise[Boolean] = js.native
  }
  
  trait ComponentOptions[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */] extends StObject {
    
    var validations: js.UndefOr[RuleDecl | DynamicDecl] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    extension [Self <: ComponentOptions[?], V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](x: Self & ComponentOptions[V]) {
      
      inline def setValidations(value: RuleDecl | DynamicDecl): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      inline def setValidationsFunction0(value: () => RuleDecl): Self = StObject.set(x, "validations", js.Any.fromFunction0(value))
      
      inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    }
  }
  
  type DynamicDecl = js.Function0[RuleDecl]
  
  type GroupDecl = js.Array[String]
  
  type NestedDecl = RuleDecl
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RuleDecl = {[rule: string] : vuelidate.vue/types/options.ValidationDecl | vuelidate.vue/types/options.GroupDecl | vuelidate.vue/types/options.AsyncDecl | vuelidate.vue/types/options.NestedDecl}
  }}}
  to avoid circular code involving: 
  - vuelidate.vue/types/options.DynamicDecl
  - vuelidate.vue/types/options.NestedDecl
  - vuelidate.vue/types/options.RuleDecl
  - vuelidate.vue/types/options.ValidPropertyDecl
  */
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
  
  type ValidationDecl = ValidationRule | (js.Function1[/* repeated */ Any, ValidationRule])
}
