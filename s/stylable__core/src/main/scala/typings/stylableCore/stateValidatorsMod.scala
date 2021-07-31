package typings.stylableCore

import typings.std.Record
import typings.stylableCore.typesMod.StateArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateValidatorsMod {
  
  @JSImport("@stylable/core/cjs/state-validators", "systemValidators")
  @js.native
  val systemValidators: Record[String, StateParamType] = js.native
  
  trait StateParamType extends StObject {
    
    var subValidators: js.UndefOr[Record[String, SubValidator]] = js.undefined
    
    def validate(
      value: js.Any,
      args: StateArguments,
      resolveParam: js.Any,
      validateDefinition: Boolean,
      validateValue: Boolean
    ): StateResult
  }
  object StateParamType {
    
    @scala.inline
    def apply(validate: (js.Any, StateArguments, js.Any, Boolean, Boolean) => StateResult): StateParamType = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction5(validate))
      __obj.asInstanceOf[StateParamType]
    }
    
    @scala.inline
    implicit class StateParamTypeMutableBuilder[Self <: StateParamType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubValidators(value: Record[String, SubValidator]): Self = StObject.set(x, "subValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubValidatorsUndefined: Self = StObject.set(x, "subValidators", js.undefined)
      
      @scala.inline
      def setValidate(value: (js.Any, StateArguments, js.Any, Boolean, Boolean) => StateResult): Self = StObject.set(x, "validate", js.Any.fromFunction5(value))
    }
  }
  
  trait StateResult extends StObject {
    
    var errors: js.Array[String] | Null
    
    var res: String
  }
  object StateResult {
    
    @scala.inline
    def apply(res: String): StateResult = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], errors = null)
      __obj.asInstanceOf[StateResult]
    }
    
    @scala.inline
    implicit class StateResultMutableBuilder[Self <: StateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubValidator extends StObject {
    
    def apply(value: String, rest: String*): StateResult = js.native
  }
}
