package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import typings.vuelidate.validatorsMod.ValidationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vuelidateMod {
  
  @JSImport("vuelidate/vuelidate", "Vuelidate")
  @js.native
  val Vuelidate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<any> */ Any = js.native
  
  @JSImport("vuelidate/vuelidate", "validationMixin")
  @js.native
  val validationMixin: Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any */ trait Validation extends StObject {
    
    @JSName("$anyDirty")
    val $anyDirty: Boolean
    
    @JSName("$anyError")
    val $anyError: Boolean
    
    @JSName("$dirty")
    val $dirty: Boolean
    
    @JSName("$error")
    val $error: Boolean
    
    @JSName("$flattenParams")
    def $flattenParams(): js.Array[ValidationParams]
    
    // const validationGetters
    @JSName("$invalid")
    val $invalid: Boolean
    
    @JSName("$model")
    var $model: Any
    
    @JSName("$params")
    val $params: StringDictionary[Any]
    
    @JSName("$pending")
    val $pending: Boolean
    
    @JSName("$reset")
    def $reset(): Unit
    
    // const validationMethods
    @JSName("$touch")
    def $touch(): Unit
  }
  object Validation {
    
    inline def apply(
      $anyDirty: Boolean,
      $anyError: Boolean,
      $dirty: Boolean,
      $error: Boolean,
      $flattenParams: () => js.Array[ValidationParams],
      $invalid: Boolean,
      $model: Any,
      $params: StringDictionary[Any],
      $pending: Boolean,
      $reset: () => Unit,
      $touch: () => Unit
    ): Validation = {
      val __obj = js.Dynamic.literal($anyDirty = $anyDirty.asInstanceOf[js.Any], $anyError = $anyError.asInstanceOf[js.Any], $dirty = $dirty.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $flattenParams = js.Any.fromFunction0($flattenParams), $invalid = $invalid.asInstanceOf[js.Any], $model = $model.asInstanceOf[js.Any], $params = $params.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any], $reset = js.Any.fromFunction0($reset), $touch = js.Any.fromFunction0($touch))
      __obj.asInstanceOf[Validation]
    }
    
    extension [Self <: Validation](x: Self) {
      
      inline def set$anyDirty(value: Boolean): Self = StObject.set(x, "$anyDirty", value.asInstanceOf[js.Any])
      
      inline def set$anyError(value: Boolean): Self = StObject.set(x, "$anyError", value.asInstanceOf[js.Any])
      
      inline def set$dirty(value: Boolean): Self = StObject.set(x, "$dirty", value.asInstanceOf[js.Any])
      
      inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
      
      inline def set$flattenParams(value: () => js.Array[ValidationParams]): Self = StObject.set(x, "$flattenParams", js.Any.fromFunction0(value))
      
      inline def set$invalid(value: Boolean): Self = StObject.set(x, "$invalid", value.asInstanceOf[js.Any])
      
      inline def set$model(value: Any): Self = StObject.set(x, "$model", value.asInstanceOf[js.Any])
      
      inline def set$params(value: StringDictionary[Any]): Self = StObject.set(x, "$params", value.asInstanceOf[js.Any])
      
      inline def set$pending(value: Boolean): Self = StObject.set(x, "$pending", value.asInstanceOf[js.Any])
      
      inline def set$reset(value: () => Unit): Self = StObject.set(x, "$reset", js.Any.fromFunction0(value))
      
      inline def set$touch(value: () => Unit): Self = StObject.set(x, "$touch", js.Any.fromFunction0(value))
    }
  }
}
