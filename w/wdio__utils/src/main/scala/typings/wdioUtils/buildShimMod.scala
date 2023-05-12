package typings.wdioUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildShimMod {
  
  @JSImport("@wdio/utils/build/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * execute test or hook asynchronously
    *
    * @param  {Function} fn         spec or hook method
    * @param  {object}   retries    { limit: number, attempts: number }
    * @param  {Array}    args       arguments passed to hook
    * @return {Promise}             that gets resolved once test/hook is done or was retried enough
    */
  inline def executeAsync(fn: js.Function, retries: Retries): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def executeAsync(fn: js.Function, retries: Retries, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def executeHooksWithArgs[T](hookName: String): js.Promise[js.Array[js.Error | T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Array[js.Function]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Array[js.Function], args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Function): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Function, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: Unit, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  
  object global {
    
    @JSGlobal("expectAsync")
    @js.native
    def expectAsync: Any = js.native
    inline def expectAsync_=(x: Any): Unit = js.Dynamic.global.updateDynamic("expectAsync")(x.asInstanceOf[js.Any])
    
    object NodeJS {
      
      trait Global extends StObject {
        
        var expect: Any
        
        var expectAsync: Any
      }
      object Global {
        
        inline def apply(expect: Any, expectAsync: Any): Global = {
          val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any], expectAsync = expectAsync.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
          
          inline def setExpect(value: Any): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
          
          inline def setExpectAsync(value: Any): Self = StObject.set(x, "expectAsync", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  /**
    * wrap command to enable before and after command to be executed
    * @param commandName name of the command (e.g. getTitle)
    * @param fn          command function
    */
  inline def wrapCommand[T](commandName: String, fn: js.Function): js.Function1[/* args */ Any, js.Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCommand")(commandName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Any, js.Promise[T]]]
  
  trait Retries extends StObject {
    
    var attempts: Double
    
    var limit: Double
  }
  object Retries {
    
    inline def apply(attempts: Double, limit: Double): Retries = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Retries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Retries] (val x: Self) extends AnyVal {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
