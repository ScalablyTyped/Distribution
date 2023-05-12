package typings.wordpressCompose

import typings.std.Parameters
import typings.std.ReturnType
import typings.wordpressCompose.anon.Call
import typings.wordpressCompose.anon.PartialDebounceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesUtilsDebounceMod {
  
  @JSImport("@wordpress/compose/build-types/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */](func: FunctionT, wait: Double): Call[FunctionT] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Call[FunctionT]]
  inline def debounce[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */](func: FunctionT, wait: Double, options: PartialDebounceOptions): Call[FunctionT] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call[FunctionT]]
  
  trait DebounceOptions extends StObject {
    
    var leading: Boolean
    
    var maxWait: Double
    
    var trailing: Boolean
  }
  object DebounceOptions {
    
    inline def apply(leading: Boolean, maxWait: Double, trailing: Boolean): DebounceOptions = {
      val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], maxWait = maxWait.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DebouncedFunc[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    /**
      * Call the original function, but applying the debounce rules.
      *
      * If the debounced function can be run immediately, this calls it and returns its return
      * value.
      *
      * Otherwise, it returns the return value of the last invocation, or undefined if the debounced
      * function was not invoked yet.
      */
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): js.UndefOr[ReturnType[T]] = js.native
    
    /**
      * Throw away any pending invocation of the debounced function.
      */
    def cancel(): Unit = js.native
    
    /**
      * If there is a pending invocation of the debounced function, invoke it immediately and return
      * its return value.
      *
      * Otherwise, return the value from the last invocation, or undefined if the debounced function
      * was never invoked.
      */
    def flush(): js.UndefOr[ReturnType[T]] = js.native
  }
}
