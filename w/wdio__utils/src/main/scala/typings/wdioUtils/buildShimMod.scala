package typings.wdioUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildShimMod {
  
  @JSImport("@wdio/utils/build/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wdio/utils/build/shim", "asyncSpec")
  @js.native
  def asyncSpec: Boolean = js.native
  inline def asyncSpec_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncSpec")(x.asInstanceOf[js.Any])
  
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
  
  @JSImport("@wdio/utils/build/shim", "executeHooksWithArgs")
  @js.native
  def executeHooksWithArgs: js.Function3[
    /* hookName */ String, 
    /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
    /* args */ js.UndefOr[js.Array[Any]], 
    js.Promise[js.Array[js.Error | Any]]
  ] = js.native
  inline def executeHooksWithArgs_=(
    x: js.Function3[
      /* hookName */ String, 
      /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
      /* args */ js.UndefOr[js.Array[Any]], 
      js.Promise[js.Array[js.Error | Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeHooksWithArgs")(x.asInstanceOf[js.Any])
  
  /**
    * execute test or hook synchronously
    *
    * @param  {Function} fn         spec or hook method
    * @param  {Number}   retries    { limit: number, attempts: number }
    * @param  {Array}    args       arguments passed to hook
    * @return {Promise}             that gets resolved once test/hook is done or was retried enough
    */
  /* was `typeof executeSyncFn` */
  inline def executeSync(fn: js.Function, retries: Retries): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def executeSync(fn: js.Function, retries: Retries, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def expectAsyncShim(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expectAsyncShim")().asInstanceOf[Any]
  inline def expectAsyncShim(actual: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expectAsyncShim")(actual.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def expectAsyncShim(actual: Any, syncMatcher: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expectAsyncShim")(actual.asInstanceOf[js.Any], syncMatcher.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def expectAsyncShim(actual: Unit, syncMatcher: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("expectAsyncShim")(actual.asInstanceOf[js.Any], syncMatcher.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object global {
    
    @JSGlobal("_HAS_FIBER_CONTEXT")
    @js.native
    def _HAS_FIBER_CONTEXT: Boolean = js.native
    inline def _HAS_FIBER_CONTEXT_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("_HAS_FIBER_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("browser")
    @js.native
    def browser: Any = js.native
    inline def browser_=(x: Any): Unit = js.Dynamic.global.updateDynamic("browser")(x.asInstanceOf[js.Any])
    
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
        
        extension [Self <: Global](x: Self) {
          
          inline def setExpect(value: Any): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
          
          inline def setExpectAsync(value: Any): Self = StObject.set(x, "expectAsync", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  @JSImport("@wdio/utils/build/shim", "hasWdioSyncSupport")
  @js.native
  def hasWdioSyncSupport: Boolean = js.native
  inline def hasWdioSyncSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWdioSyncSupport")(x.asInstanceOf[js.Any])
  
  @JSImport("@wdio/utils/build/shim", "runAsync")
  @js.native
  def runAsync: Boolean = js.native
  inline def runAsync_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runAsync")(x.asInstanceOf[js.Any])
  
  @JSImport("@wdio/utils/build/shim", "runFnInFiberContext")
  @js.native
  def runFnInFiberContext: js.Function1[
    /* fn */ js.Function, 
    js.ThisFunction1[/* this */ Any, /* repeated */ Any, js.Promise[Any]]
  ] = js.native
  inline def runFnInFiberContext_=(
    x: js.Function1[
      /* fn */ js.Function, 
      js.ThisFunction1[/* this */ Any, /* repeated */ Any, js.Promise[Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runFnInFiberContext")(x.asInstanceOf[js.Any])
  
  @JSImport("@wdio/utils/build/shim", "runSync")
  @js.native
  def runSync: js.ThisFunction3[
    /* this */ Any, 
    /* fn */ js.Function, 
    /* repeatTest */ Any, 
    /* args */ js.Array[Any], 
    js.Function2[/* resolve */ js.Function, /* reject */ js.Function, Any]
  ] = js.native
  inline def runSync_=(
    x: js.ThisFunction3[
      /* this */ Any, 
      /* fn */ js.Function, 
      /* repeatTest */ Any, 
      /* args */ js.Array[Any], 
      js.Function2[/* resolve */ js.Function, /* reject */ js.Function, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runSync")(x.asInstanceOf[js.Any])
  
  inline def switchSyncFlag(fn: js.Function): js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchSyncFlag")(fn.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any]]
  
  /**
    * wrap command to enable before and after command to be executed
    * @param commandName name of the command (e.g. getTitle)
    * @param fn          command function
    */
  @JSImport("@wdio/utils/build/shim", "wrapCommand")
  @js.native
  def wrapCommand: js.Function2[
    /* commandName */ String, 
    /* fn */ js.Function, 
    js.Function1[/* args */ Any, js.Promise[Any]]
  ] = js.native
  inline def wrapCommand_=(
    x: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function, 
      js.Function1[/* args */ Any, js.Promise[Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapCommand")(x.asInstanceOf[js.Any])
  
  trait Retries extends StObject {
    
    var attempts: Double
    
    var limit: Double
  }
  object Retries {
    
    inline def apply(attempts: Double, limit: Double): Retries = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Retries]
    }
    
    extension [Self <: Retries](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
