package typings.verror

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("verror", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with VError {
    def this(message: String, params: js.Any*) = this()
    def this(message: Unit, params: js.Any*) = this()
    def this(options: Error, message: String, params: js.Any*) = this()
    def this(options: Options, message: String, params: js.Any*) = this()
    
    /* CompleteClass */
    override def cause(): js.UndefOr[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("verror", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Instantiable3[
    /* options */ Options | Error, 
    /* message */ String, 
    /* params (repeated) */ js.Any, 
    VError
  ]) = js.native
  
  /*
    * Represents a collection of errors for the purpose of consumers that generally
    * only deal with one error.  Callers can extract the individual errors
    * contained in this object, but may also just treat it as a normal single
    * error, in which case a summary message will be printed.
    */
  @JSImport("verror", "MultiError")
  @js.native
  class MultiError protected ()
    extends StObject
       with VError {
    def this(errors: js.Array[Error]) = this()
    
    /* CompleteClass */
    override def cause(): js.UndefOr[Error] = js.native
    
    def errors(): js.Array[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  /*
    * SError is like VError, but stricter about types.  You cannot pass "null" or
    * "undefined" as string arguments to the formatter.  Since SError is only a
    * different function, not really a different class, we don't set
    * SError.prototype.name.
    */
  @JSImport("verror", "SError")
  @js.native
  class SError ()
    extends StObject
       with VError {
    
    /* CompleteClass */
    override def cause(): js.UndefOr[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait VError
    extends StObject
       with Error {
    
    def cause(): js.UndefOr[Error]
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
  class VErrorCls protected ()
    extends StObject
       with VError {
    def this(options: Error, message: String, params: js.Any*) = this()
    def this(options: Options, message: String, params: js.Any*) = this()
    
    /* CompleteClass */
    override def cause(): js.UndefOr[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  /*
    * Like JavaScript's built-in Error class, but supports a "cause" argument which
    * is wrapped, not "folded in" as with VError.    Accepts a printf-style message.
    * The cause argument can be null.
    */
  @JSImport("verror", "WError")
  @js.native
  class WError ()
    extends StObject
       with VError {
    
    /* CompleteClass */
    override def cause(): js.UndefOr[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* static member */
  @scala.inline
  def cause(err: Error): Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cause")(err.asInstanceOf[js.Any]).asInstanceOf[Error | Null]
  
  /* static member */
  @scala.inline
  def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForEach")(err.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorFromList")(errors.asInstanceOf[js.Any]).asInstanceOf[Null | T | MultiError]
  
  /* static member */
  @scala.inline
  def findCauseByName(err: Error, name: String): Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findCauseByName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Error | Null]
  
  /* static member */
  @scala.inline
  def fullStack(err: Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fullStack")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def hasCauseWithName(err: Error, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCauseWithName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def info(err: Error): Info_ = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(err.asInstanceOf[js.Any]).asInstanceOf[Info_]
  
  type Info_ = StringDictionary[js.Any]
  
  trait Options extends StObject {
    
    var cause: js.UndefOr[Error | Null] = js.undefined
    
    var constructorOpt: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var info: js.UndefOr[Info_] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
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
  
  type _To = js.Object & (Instantiable3[
    /* options */ Options | Error, 
    /* message */ String, 
    /* params (repeated) */ js.Any, 
    VError
  ])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (Instantiable3[
    /* options */ Options | Error, 
    /* message */ String, 
    /* params (repeated) */ js.Any, 
    VError
  ]) = ^
}
