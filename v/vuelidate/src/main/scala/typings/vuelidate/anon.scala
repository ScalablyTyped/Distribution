package typings.vuelidate

import typings.vuelidate.vueMod.ValidationEvaluation
import typings.vuelidate.vueMod.ValidationProperties
import typings.vuelidate.vuelidateMod.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined vuelidate.vue/types/vue.ValidationProperties<vuelidate.vue/types/vue.Vue> */
  trait ValidationPropertiesVue extends StObject {
    
    var delayTouch: js.UndefOr[
        Validation & (ValidationProperties[js.Function1[/* v */ Validation, Unit]]) & ValidationEvaluation
      ] = js.undefined
  }
  object ValidationPropertiesVue {
    
    inline def apply(): ValidationPropertiesVue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationPropertiesVue]
    }
    
    extension [Self <: ValidationPropertiesVue](x: Self) {
      
      inline def setDelayTouch(
        value: Validation & (ValidationProperties[js.Function1[/* v */ Validation, Unit]]) & ValidationEvaluation
      ): Self = StObject.set(x, "delayTouch", value.asInstanceOf[js.Any])
      
      inline def setDelayTouchUndefined: Self = StObject.set(x, "delayTouch", js.undefined)
    }
  }
}
