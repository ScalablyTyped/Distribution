package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vuelidate.validatorsMod.ValidationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vuelidateMod {
  
  @JSImport("vuelidate/vuelidate", "Vuelidate")
  @js.native
  val Vuelidate: PluginFunction[js.Any] = js.native
  
  @JSImport("vuelidate/vuelidate", "validationMixin")
  @js.native
  val validationMixin: js.Any = js.native
  
  @js.native
  trait Validation
    extends StObject
       with Vue {
    
    @JSName("$anyDirty")
    val $anyDirty: Boolean = js.native
    
    @JSName("$anyError")
    val $anyError: Boolean = js.native
    
    @JSName("$dirty")
    val $dirty: Boolean = js.native
    
    @JSName("$error")
    val $error: Boolean = js.native
    
    @JSName("$flattenParams")
    def $flattenParams(): js.Array[ValidationParams] = js.native
    
    // const validationGetters
    @JSName("$invalid")
    val $invalid: Boolean = js.native
    
    @JSName("$model")
    var $model: js.Any = js.native
    
    @JSName("$params")
    val $params: StringDictionary[js.Any] = js.native
    
    @JSName("$pending")
    val $pending: Boolean = js.native
    
    @JSName("$reset")
    def $reset(): Unit = js.native
    
    // const validationMethods
    @JSName("$touch")
    def $touch(): Unit = js.native
  }
}
