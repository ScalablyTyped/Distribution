package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import typings.vuelidate.anon.ValidationPropertiesVue
import typings.vuelidate.vuelidateMod.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueTypesVueMod {
  
  type ValidationEvaluation = StringDictionary[Boolean]
  
  type ValidationGroups = StringDictionary[Validation & ValidationProperties[Any]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in std.Exclude<keyof V, '$v'> ]:? vuelidate.vuelidate/vuelidate.Validation & vuelidate.vue/types/vue.ValidationProperties<V[P]> & vuelidate.vue/types/vue.ValidationEvaluation}
    }}}
    */
  @js.native
  trait ValidationProperties[V] extends StObject
  
  trait Vue extends StObject {
    
    @JSName("$v")
    var $v: ValidationPropertiesVue & ValidationGroups & Validation
    
    def delayTouch(v: Validation): Unit
  }
  object Vue {
    
    inline def apply($v: ValidationPropertiesVue & ValidationGroups & Validation, delayTouch: Validation => Unit): Vue = {
      val __obj = js.Dynamic.literal($v = $v.asInstanceOf[js.Any], delayTouch = js.Any.fromFunction1(delayTouch))
      __obj.asInstanceOf[Vue]
    }
    
    extension [Self <: Vue](x: Self) {
      
      inline def set$v(value: ValidationPropertiesVue & ValidationGroups & Validation): Self = StObject.set(x, "$v", value.asInstanceOf[js.Any])
      
      inline def setDelayTouch(value: Validation => Unit): Self = StObject.set(x, "delayTouch", js.Any.fromFunction1(value))
    }
  }
}
