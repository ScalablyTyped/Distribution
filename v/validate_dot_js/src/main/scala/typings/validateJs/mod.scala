package typings.validateJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("validate.js", JSImport.Namespace)
  @js.native
  val ^ : ValidateJS = js.native
  
  trait AsyncValidateOption extends StObject {
    
    var cleanAttributes: js.UndefOr[Boolean] = js.undefined
    
    var prettify: js.UndefOr[js.Function] = js.undefined
    
    var wrapErrors: js.UndefOr[js.Function] = js.undefined
  }
  object AsyncValidateOption {
    
    inline def apply(): AsyncValidateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncValidateOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncValidateOption] (val x: Self) extends AnyVal {
      
      inline def setCleanAttributes(value: Boolean): Self = StObject.set(x, "cleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setCleanAttributesUndefined: Self = StObject.set(x, "cleanAttributes", js.undefined)
      
      inline def setPrettify(value: js.Function): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      inline def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      inline def setWrapErrors(value: js.Function): Self = StObject.set(x, "wrapErrors", value.asInstanceOf[js.Any])
      
      inline def setWrapErrorsUndefined: Self = StObject.set(x, "wrapErrors", js.undefined)
    }
  }
  
  trait CollectFormValuesOption extends StObject {
    
    var nullify: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object CollectFormValuesOption {
    
    inline def apply(): CollectFormValuesOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectFormValuesOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectFormValuesOption] (val x: Self) extends AnyVal {
      
      inline def setNullify(value: Boolean): Self = StObject.set(x, "nullify", value.asInstanceOf[js.Any])
      
      inline def setNullifyUndefined: Self = StObject.set(x, "nullify", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  @js.native
  trait ValidateJS extends StObject {
    
    def apply(attributes: Any, constraints: Any): Any = js.native
    def apply(attributes: Any, constraints: Any, options: ValidateOption): Any = js.native
    
    def async(attributes: Any, constraints: Any): js.Promise[Any] = js.native
    def async(attributes: Any, constraints: Any, options: AsyncValidateOption): js.Promise[Any] = js.native
    
    def capitalize(value: String): String = js.native
    
    def cleanAttributes(attributes: Any, whitelist: Any): Any = js.native
    
    def collectFormValues(form: Any): Any = js.native
    def collectFormValues(form: Any, options: CollectFormValuesOption): Any = js.native
    
    def contains(obj: Any, value: Any): Boolean = js.native
    
    def extend(obj: Any, otherObjects: Any*): Any = js.native
    
    def format(str: String, vals: Any): String = js.native
    
    var formatters: Any = js.native
    
    def getDeepObjectValue(obj: Any, keypath: String): Any = js.native
    
    def isArray(value: Any): Boolean = js.native
    
    def isBoolean(value: Any): Boolean = js.native
    
    def isDate(value: Any): Boolean = js.native
    
    def isDefined(value: Any): Boolean = js.native
    
    def isDomElement(value: Any): Boolean = js.native
    
    def isEmpty(value: Any): Boolean = js.native
    
    def isFunction(value: Any): Boolean = js.native
    
    def isHash(value: Any): Boolean = js.native
    
    def isInteger(value: Any): Boolean = js.native
    
    def isNumber(value: Any): Boolean = js.native
    
    def isObject(value: Any): Boolean = js.native
    
    def isPromise(value: Any): Boolean = js.native
    
    def isString(value: Any): Boolean = js.native
    
    def prettify(value: String): String = js.native
    
    def result(value: Any, args: Any*): Any = js.native
    
    def single(value: Any, constraints: Any): Any = js.native
    def single(value: Any, constraints: Any, options: ValidateOption): Any = js.native
    
    def validate(attributes: Any, constraints: Any): Any = js.native
    def validate(attributes: Any, constraints: Any, options: ValidateOption): Any = js.native
    
    var validators: Any = js.native
  }
  
  trait ValidateOption extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var fullMessages: js.UndefOr[Boolean] = js.undefined
    
    var prettify: js.UndefOr[js.Function] = js.undefined
  }
  object ValidateOption {
    
    inline def apply(): ValidateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateOption] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFullMessages(value: Boolean): Self = StObject.set(x, "fullMessages", value.asInstanceOf[js.Any])
      
      inline def setFullMessagesUndefined: Self = StObject.set(x, "fullMessages", js.undefined)
      
      inline def setPrettify(value: js.Function): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      inline def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
    }
  }
  
  type _To = ValidateJS
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ValidateJS = ^
}
