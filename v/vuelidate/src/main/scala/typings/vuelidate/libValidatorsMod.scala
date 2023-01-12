package typings.vuelidate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidatorsMod {
  
  @JSImport("vuelidate/lib/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alpha(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("alpha")().asInstanceOf[ValidationRule]
  
  inline def alphaNum(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaNum")().asInstanceOf[ValidationRule]
  
  inline def and(validators: (ValidationFunc | CustomRule)*): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(validators.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ValidationRule]
  
  inline def between(min: js.Date, max: js.Date): ValidationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidationRule]
  inline def between(min: js.Date, max: Double): ValidationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidationRule]
  inline def between(min: Double, max: js.Date): ValidationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidationRule]
  inline def between(min: Double, max: Double): ValidationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidationRule]
  
  inline def decimal(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decimal")().asInstanceOf[ValidationRule]
  
  inline def email(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[ValidationRule]
  
  @JSImport("vuelidate/lib/validators", "helpers")
  @js.native
  val helpers: Helpers_ = js.native
  
  inline def integer(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[ValidationRule]
  
  inline def ipAddress(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("ipAddress")().asInstanceOf[ValidationRule]
  
  inline def macAddress(separator: String): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("macAddress")(separator.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def maxLength(length: Double): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(length.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def maxValue(max: js.Date): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("maxValue")(max.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  inline def maxValue(max: Double): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("maxValue")(max.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def minLength(length: Double): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("minLength")(length.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def minValue(min: js.Date): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("minValue")(min.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  inline def minValue(min: Double): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("minValue")(min.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def not(validator: CustomRule): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(validator.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  inline def not(validator: ValidationRule): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(validator.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def numeric(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("numeric")().asInstanceOf[ValidationRule]
  
  inline def or(validators: (ValidationFunc | CustomRule)*): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(validators.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ValidationRule]
  
  inline def required(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[ValidationRule]
  
  inline def requiredIf(field: String): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("requiredIf")(field.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  inline def requiredIf(
    field: js.Function2[
      /* vm */ Any, 
      /* parentVm */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
      ], 
      Any
    ]
  ): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("requiredIf")(field.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def requiredUnless(field: String): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("requiredUnless")(field.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  inline def requiredUnless(
    field: js.Function2[
      /* vm */ Any, 
      /* parentVm */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
      ], 
      Any
    ]
  ): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("requiredUnless")(field.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def sameAs(field: String): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("sameAs")(field.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  inline def sameAs(
    field: js.Function2[
      /* vm */ Any, 
      /* parentVm */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
      ], 
      Any
    ]
  ): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("sameAs")(field.asInstanceOf[js.Any]).asInstanceOf[ValidationRule]
  
  inline def url(): ValidationRule = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[ValidationRule]
  
  type CustomRule = js.Function2[/* value */ Any, /* parentVm */ js.UndefOr[Any], Boolean | js.Promise[Boolean]]
  
  @js.native
  trait Helpers_ extends StObject {
    
    def len(value: Any): Double = js.native
    
    def ref(reference: String, vm: Any): Any = js.native
    def ref(
      reference: String,
      vm: Any,
      parentVm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ): Any = js.native
    def ref(
      reference: js.Function2[
          /* vm */ Any, 
          /* parentVm */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
          ], 
          Any
        ],
      vm: Any
    ): Any = js.native
    def ref(
      reference: js.Function2[
          /* vm */ Any, 
          /* parentVm */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
          ], 
          Any
        ],
      vm: Any,
      parentVm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ): Any = js.native
    
    def regex(`type`: String, expr: js.RegExp): ValidationRule = js.native
    
    def req(value: Any): Boolean = js.native
    
    def withParams(params: Params, rule: CustomRule): ValidationRule = js.native
    def withParams(params: Params, rule: ValidationRule): ValidationRule = js.native
  }
  
  trait Params
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `type`: String
  }
  object Params {
    
    inline def apply(`type`: String): Params = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidationFunc = js.Function0[ValidationRule]
  
  trait ValidationParams extends StObject {
    
    val name: String
    
    val params: Params
    
    val path: js.Array[String]
  }
  object ValidationParams {
    
    inline def apply(name: String, params: Params, path: js.Array[String]): ValidationParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationParams] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  @js.native
  trait ValidationRule extends StObject {
    
    def apply(params: Any*): Boolean = js.native
    
    @JSName("$params")
    def $params(): ValidationParams = js.native
    
    @JSName("$pending")
    def $pending(): Boolean = js.native
  }
}
