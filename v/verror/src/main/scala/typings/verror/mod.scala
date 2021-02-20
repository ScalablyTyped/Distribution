package typings.verror

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("verror", JSImport.Namespace)
  @js.native
  class ^ protected () extends VError {
    def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
    def this(message: String, params: js.Any*) = this()
    def this(options: Error, message: String, params: js.Any*) = this()
    def this(options: Options, message: String, params: js.Any*) = this()
  }
  @JSImport("verror", JSImport.Namespace)
  @js.native
  val ^ : Instantiable3[
    /* options */ Options | Error, 
    /* message */ String, 
    /* params (repeated) */ js.Any, 
    VError
  ] = js.native
  
  /*
    * Represents a collection of errors for the purpose of consumers that generally
    * only deal with one error.  Callers can extract the individual errors
    * contained in this object, but may also just treat it as a normal single
    * error, in which case a summary message will be printed.
    */
  @JSImport("verror", "MultiError")
  @js.native
  class MultiError protected () extends VError {
    def this(errors: js.Array[Error]) = this()
    
    def errors(): js.Array[Error] = js.native
  }
  
  /*
    * SError is like VError, but stricter about types.  You cannot pass "null" or
    * "undefined" as string arguments to the formatter.  Since SError is only a
    * different function, not really a different class, we don't set
    * SError.prototype.name.
    */
  @JSImport("verror", "SError")
  @js.native
  class SError () extends VError
  
  @js.native
  trait VError extends Error {
    
    def cause(): js.UndefOr[Error] = js.native
  }
  object VError {
    
    /* static member */
    @JSImport("verror", "VError")
    @js.native
    val ^ : Instantiable3[
        /* options */ Options | Error, 
        /* message */ String, 
        /* params (repeated) */ js.Any, 
        VError
      ] = js.native
    
    @scala.inline
    implicit class VErrorMutableBuilder[Self <: VError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: () => js.UndefOr[Error]): Self = StObject.set(x, "cause", js.Any.fromFunction0(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("verror", "VError")
  @js.native
  class VErrorCls protected () extends VError {
    def this(options: Error, message: String, params: js.Any*) = this()
    def this(options: Options, message: String, params: js.Any*) = this()
  }
  
  /*
    * Like JavaScript's built-in Error class, but supports a "cause" argument which
    * is wrapped, not "folded in" as with VError.    Accepts a printf-style message.
    * The cause argument can be null.
    */
  @JSImport("verror", "WError")
  @js.native
  class WError () extends VError
  
  /* static member */
  @JSImport("verror", "cause")
  @js.native
  def cause(err: Error): Error | Null = js.native
  
  /* static member */
  @JSImport("verror", "errorForEach")
  @js.native
  def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /* static member */
  @JSImport("verror", "errorFromList")
  @js.native
  def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  
  /* static member */
  @JSImport("verror", "findCauseByName")
  @js.native
  def findCauseByName(err: Error, name: String): Error | Null = js.native
  
  /* static member */
  @JSImport("verror", "fullStack")
  @js.native
  def fullStack(err: Error): String = js.native
  
  /* static member */
  @JSImport("verror", "hasCauseWithName")
  @js.native
  def hasCauseWithName(err: Error, name: String): Boolean = js.native
  
  /* static member */
  @JSImport("verror", "info")
  @js.native
  def info(err: Error): Info_ = js.native
  
  type Info_ = StringDictionary[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var cause: js.UndefOr[Error | Null] = js.native
    
    var constructorOpt: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var info: js.UndefOr[Info_] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseNull: Self = StObject.set(x, "cause", null)
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setConstructorOpt(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "constructorOpt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstructorOptUndefined: Self = StObject.set(x, "constructorOpt", js.undefined)
      
      @scala.inline
      def setInfo(value: Info_): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type _To = Instantiable3[
    /* options */ Options | Error, 
    /* message */ String, 
    /* params (repeated) */ js.Any, 
    VError
  ]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Instantiable3[
    /* options */ Options | Error, 
    /* message */ String, 
    /* params (repeated) */ js.Any, 
    VError
  ] = ^
}
