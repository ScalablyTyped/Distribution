package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.vuelidate.anon.ValidationPropertiesVueVa
import typings.vuelidate.vuelidateMod.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  type ValidationEvaluation = StringDictionary[Boolean]
  
  type ValidationGroups = StringDictionary[Validation & ValidationProperties[js.Any]]
  
  type ValidationProperties[V] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof V, '$v'> ]:? vuelidate.vuelidate/vuelidate.Validation & / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vuelidate.vue/types/vue.ValidationProperties<V[P]> * / object & vuelidate.vue/types/vue.ValidationEvaluation}
    */ typings.vuelidate.vuelidateStrings.ValidationProperties & TopLevel[js.Any]
  
  trait Vue extends StObject {
    
    @JSName("$v")
    var $v: ValidationPropertiesVueVa
    
    def delayTouch(v: Validation): Unit
  }
  object Vue {
    
    @scala.inline
    def apply($v: ValidationPropertiesVueVa, delayTouch: Validation => Unit): Vue = {
      val __obj = js.Dynamic.literal($v = $v.asInstanceOf[js.Any], delayTouch = js.Any.fromFunction1(delayTouch))
      __obj.asInstanceOf[Vue]
    }
    
    @scala.inline
    implicit class VueMutableBuilder[Self <: Vue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$v(value: ValidationPropertiesVueVa): Self = StObject.set(x, "$v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTouch(value: Validation => Unit): Self = StObject.set(x, "delayTouch", js.Any.fromFunction1(value))
    }
  }
}
