package typings.validatorjs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.validatorjs.validatorjsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("validatorjs", JSImport.Namespace)
  @js.native
  class ^[A] protected () extends Validator[A] {
    def this(data: A, rules: Rules) = this()
    def this(data: A, rules: Rules, customMessages: ErrorMessages) = this()
  }
  @JSImport("validatorjs", JSImport.Namespace)
  @js.native
  val ^ : ValidatorStatic = js.native
  
  type AttributeFormatter = js.Function1[/* attribute */ js.Any, js.Any]
  
  type AttributeNames = StringDictionary[String]
  
  @js.native
  trait ErrorMessages extends /* key */ StringDictionary[String | ErrorMessages]
  object ErrorMessages {
    
    @scala.inline
    def apply(): ErrorMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorMessages]
    }
  }
  
  @js.native
  trait Errors extends StObject {
    
    def add(attribute: String, message: String): Unit = js.native
    
    def all(): ValidationErrors = js.native
    
    var errors: ValidationErrors = js.native
    
    def first(attribute: String): String | `false` = js.native
    
    def get(attribute: String): js.Array[String] = js.native
    
    def has(attribute: String): Boolean = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(
      add: (String, String) => Unit,
      all: () => ValidationErrors,
      errors: ValidationErrors,
      first: String => String | `false`,
      get: String => js.Array[String],
      has: String => Boolean
    ): Errors = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = js.Any.fromFunction0(all), errors = errors.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, String) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAll(value: () => ValidationErrors): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrors(value: ValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst(value: String => String | `false`): Self = StObject.set(x, "first", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Array[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  type RegisterAsyncCallback = js.Function4[
    /* value */ String | Double | Boolean, 
    /* args */ String, 
    /* attribute */ String, 
    /* passes */ js.Function2[/* success */ js.UndefOr[Boolean], /* message */ js.UndefOr[String], Unit], 
    Unit
  ]
  
  type RegisterCallback = js.Function3[
    /* value */ String | Double | Boolean, 
    /* args */ String, 
    /* attribute */ String, 
    Boolean
  ]
  
  @js.native
  trait Rules
    extends /* attribute */ StringDictionary[String | (js.Array[String | TypeCheckingRule]) | Rules]
  object Rules {
    
    @scala.inline
    def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
  }
  
  type TypeCheckingRule = StringDictionary[js.Array[js.Any]]
  
  type ValidationErrors = StringDictionary[js.Array[String]]
  
  @js.native
  trait Validator[A] extends StObject {
    
    def attributeFormatter(attribute: js.Any): js.Any = js.native
    @JSName("attributeFormatter")
    var attributeFormatter_Original: AttributeFormatter = js.native
    
    def check(): Boolean = js.native
    
    def checkAsync(): Unit = js.native
    def checkAsync(passes: js.UndefOr[scala.Nothing], fails: js.Function): Unit = js.native
    def checkAsync(passes: js.Function): Unit = js.native
    def checkAsync(passes: js.Function, fails: js.Function): Unit = js.native
    
    var errorCount: Double = js.native
    
    var errors: Errors = js.native
    
    def fails(): Boolean | Unit = js.native
    def fails(fails: js.Function): Boolean | Unit = js.native
    
    def getRule(name: String): js.Function = js.native
    
    var hasAsync: Boolean = js.native
    
    var input: A = js.native
    
    var lang: String = js.native
    
    var messages: ErrorMessages = js.native
    
    var numericRules: js.Array[String] = js.native
    
    def passes(): Boolean | Unit = js.native
    def passes(passes: js.Function): Boolean | Unit = js.native
    
    var rules: Rules = js.native
    
    def setAttributeFormatter(func: AttributeFormatter): Unit = js.native
    
    def setAttributeNames(attributes: AttributeNames): Unit = js.native
    
    def stopOnError(): Boolean | Unit = js.native
    def stopOnError(passes: js.Function): Boolean | Unit = js.native
  }
  
  @js.native
  trait ValidatorStatic
    extends Instantiable2[/* data */ js.Object, /* rules */ Rules, Validator[js.Object]]
       with Instantiable3[
          /* data */ js.Object, 
          /* rules */ Rules, 
          /* customMessages */ ErrorMessages, 
          Validator[js.Object]
        ] {
    
    def getDefaultLang(): String = js.native
    
    def getMessages(lang: String): ErrorMessages = js.native
    
    def register(name: String, fn: RegisterCallback): Unit = js.native
    def register(name: String, fn: RegisterCallback, message: String): Unit = js.native
    
    def registerAsync(name: String, fn: RegisterAsyncCallback, message: String): Unit = js.native
    
    def setAttributeFormatter(func: AttributeFormatter): Unit = js.native
    
    def setMessages(lang: String, messages: ErrorMessages): js.Any = js.native
    
    def stopOnError(attributes: js.Array[String]): Unit = js.native
    def stopOnError(attributes: Boolean): Unit = js.native
    
    def useLang(lang: String): Unit = js.native
  }
  
  type _To = ValidatorStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ValidatorStatic = ^
}
