package typings.twilioDeclarativeTypeValidator

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@twilio/declarative-type-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def array(name: String, rules: RuleArgument): RuleDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[RuleDefinition]
  
  inline def custom(checks: RuleFunction*): RuleDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(checks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RuleDefinition]
  
  inline def literal(checks: Any*): RuleDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(checks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RuleDefinition]
  
  @JSImport("@twilio/declarative-type-validator", "nonEmptyString")
  @js.native
  val nonEmptyString: RuleDefinition = js.native
  
  @JSImport("@twilio/declarative-type-validator", "nonNegativeInteger")
  @js.native
  val nonNegativeInteger: RuleDefinition = js.native
  
  inline def objectSchema(name: String, schema: Record[String, RuleArgument]): RuleDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("objectSchema")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[RuleDefinition]
  
  @JSImport("@twilio/declarative-type-validator", "pureObject")
  @js.native
  val pureObject: RuleDefinition = js.native
  
  inline def runtimeTypeValidation(rules: js.Array[js.Array[RuleDefinition]], values: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runtimeTypeValidation")(rules.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stringifyReceivedType(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyReceivedType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def `type`(checks: TypeRule*): RuleDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(checks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RuleDefinition]
  
  /* eslint-disable @typescript-eslint/no-explicit-any */
  inline def validateConstructorTypes(args: RuleArgument*): js.Function1[
    /* ctor */ Instantiable1[/* args (repeated) */ Any, Any], 
    Instantiable1[/* args (repeated) */ Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConstructorTypes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* ctor */ Instantiable1[/* args (repeated) */ Any, Any], 
    Instantiable1[/* args (repeated) */ Any, Any]
  ]]
  
  /* eslint-enable @typescript-eslint/no-explicit-any */
  inline def validateTypes(args: RuleArgument*): Decorator = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTypes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Decorator]
  
  inline def validateTypesAsync(args: RuleArgument*): Decorator = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTypesAsync")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Decorator]
  
  type Decorator = js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDeclarativeTypeValidator.mod.TypeRule
    - typings.twilioDeclarativeTypeValidator.mod.RuleDefinition
    - js.Array[
  typings.twilioDeclarativeTypeValidator.mod.TypeRule | typings.twilioDeclarativeTypeValidator.mod.RuleDefinition]
  */
  type RuleArgument = _RuleArgument | (js.Array[TypeRule | RuleDefinition])
  
  trait RuleDefinition
    extends StObject
       with _RuleArgument {
    
    var checks: js.Array[RuleFunction]
  }
  object RuleDefinition {
    
    inline def apply(checks: js.Array[RuleFunction]): RuleDefinition = {
      val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleDefinition] (val x: Self) extends AnyVal {
      
      inline def setChecks(value: js.Array[RuleFunction]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setChecksVarargs(value: RuleFunction*): Self = StObject.set(x, "checks", js.Array(value*))
    }
  }
  
  type RuleFunction = js.Function1[
    /* value */ Any, 
    js.Tuple3[Boolean, js.UndefOr[String | js.Array[String]], js.UndefOr[String]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.undefined
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.`object`
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.boolean
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.number
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.bigint
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.string
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.symbol
    - typings.twilioDeclarativeTypeValidator.twilioDeclarativeTypeValidatorStrings.function
    - typings.twilioDeclarativeTypeValidator.anon.Instantiable
  */
  trait TypeRule
    extends StObject
       with _RuleArgument
  
  trait _RuleArgument extends StObject
}
