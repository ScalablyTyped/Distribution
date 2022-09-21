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
  open class ^ protected ()
    extends StObject
       with VError {
    def this(message: String, params: Any*) = this()
    def this(message: Unit, params: Any*) = this()
    def this(options: js.Error, message: String, params: Any*) = this()
    def this(options: Options, message: String, params: Any*) = this()
    
    /* CompleteClass */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("verror", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Instantiable3[
    /* options */ Options | js.Error, 
    /* message */ String, 
    /* params (repeated) */ Any, 
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
  open class MultiError protected ()
    extends StObject
       with VError {
    def this(errors: js.Array[js.Error]) = this()
    
    /* CompleteClass */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
    
    def errors(): js.Array[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
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
  open class SError ()
    extends StObject
       with VError {
    
    /* CompleteClass */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait VError
    extends StObject
       with Error {
    
    @JSName("cause")
    def cause_MVError(): js.UndefOr[js.Error]
  }
  object VError {
    
    /* static member */
    @JSImport("verror", "VError")
    @js.native
    val ^ : Instantiable3[
        /* options */ Options | js.Error, 
        /* message */ String, 
        /* params (repeated) */ Any, 
        VError
      ] = js.native
    
    extension [Self <: VError](x: Self) {
      
      inline def setCause(value: () => js.UndefOr[js.Error]): Self = StObject.set(x, "cause", js.Any.fromFunction0(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("verror", "VError")
  @js.native
  open class VErrorCls protected ()
    extends StObject
       with VError {
    def this(options: js.Error, message: String, params: Any*) = this()
    def this(options: Options, message: String, params: Any*) = this()
    
    /* CompleteClass */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
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
  open class WError ()
    extends StObject
       with VError {
    
    /* CompleteClass */
    @JSName("cause")
    override def cause_MVError(): js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* static member */
  inline def cause(err: js.Error): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cause")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error | Null]
  
  /* static member */
  inline def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForEach")(err.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorFromList")(errors.asInstanceOf[js.Any]).asInstanceOf[Null | T | MultiError]
  
  /* static member */
  inline def findCauseByName(err: js.Error, name: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findCauseByName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  /* static member */
  inline def fullStack(err: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fullStack")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def hasCauseWithName(err: js.Error, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCauseWithName")(err.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def info(err: js.Error): Info_ = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(err.asInstanceOf[js.Any]).asInstanceOf[Info_]
  
  type Info_ = StringDictionary[Any]
  
  trait Options extends StObject {
    
    var cause: js.UndefOr[js.Error | Null] = js.undefined
    
    var constructorOpt: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var info: js.UndefOr[Info_] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseNull: Self = StObject.set(x, "cause", null)
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setConstructorOpt(value: /* repeated */ Any => Unit): Self = StObject.set(x, "constructorOpt", js.Any.fromFunction1(value))
      
      inline def setConstructorOptUndefined: Self = StObject.set(x, "constructorOpt", js.undefined)
      
      inline def setInfo(value: Info_): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type _To = js.Object & (Instantiable3[
    /* options */ Options | js.Error, 
    /* message */ String, 
    /* params (repeated) */ Any, 
    VError
  ])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (Instantiable3[
    /* options */ Options | js.Error, 
    /* message */ String, 
    /* params (repeated) */ Any, 
    VError
  ]) = ^
}
