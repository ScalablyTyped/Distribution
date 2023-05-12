package typings.wdioUtils

import typings.wdioUtils.anon.FnCall
import typings.wdioUtils.buildShimMod.Retries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTestFrameworkTypesMod {
  
  trait AfterHookParam[T] extends StObject {
    
    var afterFn: js.Function | js.Array[js.Function]
    
    def afterFnArgs(ctx: T): js.Tuple2[Any, T]
    @JSName("afterFnArgs")
    var afterFnArgs_Original: HookFnArgs[T]
  }
  object AfterHookParam {
    
    inline def apply[T](afterFn: js.Function | js.Array[js.Function], afterFnArgs: T => js.Tuple2[Any, T]): AfterHookParam[T] = {
      val __obj = js.Dynamic.literal(afterFn = afterFn.asInstanceOf[js.Any], afterFnArgs = js.Any.fromFunction1(afterFnArgs))
      __obj.asInstanceOf[AfterHookParam[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterHookParam[?], T] (val x: Self & AfterHookParam[T]) extends AnyVal {
      
      inline def setAfterFn(value: js.Function | js.Array[js.Function]): Self = StObject.set(x, "afterFn", value.asInstanceOf[js.Any])
      
      inline def setAfterFnArgs(value: T => js.Tuple2[Any, T]): Self = StObject.set(x, "afterFnArgs", js.Any.fromFunction1(value))
      
      inline def setAfterFnVarargs(value: js.Function*): Self = StObject.set(x, "afterFn", js.Array(value*))
    }
  }
  
  trait BeforeHookParam[T] extends StObject {
    
    var beforeFn: js.Function | js.Array[js.Function]
    
    def beforeFnArgs(ctx: T): js.Tuple2[Any, T]
    @JSName("beforeFnArgs")
    var beforeFnArgs_Original: HookFnArgs[T]
  }
  object BeforeHookParam {
    
    inline def apply[T](beforeFn: js.Function | js.Array[js.Function], beforeFnArgs: T => js.Tuple2[Any, T]): BeforeHookParam[T] = {
      val __obj = js.Dynamic.literal(beforeFn = beforeFn.asInstanceOf[js.Any], beforeFnArgs = js.Any.fromFunction1(beforeFnArgs))
      __obj.asInstanceOf[BeforeHookParam[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeHookParam[?], T] (val x: Self & BeforeHookParam[T]) extends AnyVal {
      
      inline def setBeforeFn(value: js.Function | js.Array[js.Function]): Self = StObject.set(x, "beforeFn", value.asInstanceOf[js.Any])
      
      inline def setBeforeFnArgs(value: T => js.Tuple2[Any, T]): Self = StObject.set(x, "beforeFnArgs", js.Any.fromFunction1(value))
      
      inline def setBeforeFnVarargs(value: js.Function*): Self = StObject.set(x, "beforeFn", js.Array(value*))
    }
  }
  
  type HookFnArgs[T] = js.Function1[/* ctx */ T, js.Tuple2[Any, T]]
  
  type SpecArguments = js.Array[js.Function] | (js.Tuple2[js.Function | String, Double | js.Function]) | (js.Tuple3[String, js.Function, Double])
  
  trait SpecFunction extends StObject {
    
    var specFn: js.Function
    
    var specFnArgs: js.Array[Any]
  }
  object SpecFunction {
    
    inline def apply(specFn: js.Function, specFnArgs: js.Array[Any]): SpecFunction = {
      val __obj = js.Dynamic.literal(specFn = specFn.asInstanceOf[js.Any], specFnArgs = specFnArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpecFunction] (val x: Self) extends AnyVal {
      
      inline def setSpecFn(value: js.Function): Self = StObject.set(x, "specFn", value.asInstanceOf[js.Any])
      
      inline def setSpecFnArgs(value: js.Array[Any]): Self = StObject.set(x, "specFnArgs", value.asInstanceOf[js.Any])
      
      inline def setSpecFnArgsVarargs(value: Any*): Self = StObject.set(x, "specFnArgs", js.Array(value*))
    }
  }
  
  trait WrapperMethods extends StObject {
    
    def executeAsync(fn: js.Function, retries: Retries): js.Promise[Any]
    def executeAsync(fn: js.Function, retries: Retries, args: js.Array[Any]): js.Promise[Any]
    @JSName("executeAsync")
    var executeAsync_Original: js.ThisFunction3[
        /* this */ Any, 
        /* fn */ js.Function, 
        /* retries */ Retries, 
        /* args */ js.UndefOr[js.Array[Any]], 
        js.Promise[Any]
      ]
    
    def executeHooksWithArgs[T](hookName: String): js.Promise[js.Array[js.Error | T]]
    def executeHooksWithArgs[T](hookName: String, hooks: js.Array[js.Function]): js.Promise[js.Array[js.Error | T]]
    def executeHooksWithArgs[T](hookName: String, hooks: js.Array[js.Function], args: js.Array[Any]): js.Promise[js.Array[js.Error | T]]
    def executeHooksWithArgs[T](hookName: String, hooks: js.Function): js.Promise[js.Array[js.Error | T]]
    def executeHooksWithArgs[T](hookName: String, hooks: js.Function, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]]
    def executeHooksWithArgs[T](hookName: String, hooks: Unit, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]]
    @JSName("executeHooksWithArgs")
    var executeHooksWithArgs_Original: FnCall
  }
  object WrapperMethods {
    
    inline def apply(
      executeAsync: js.ThisFunction3[
          /* this */ Any, 
          /* fn */ js.Function, 
          /* retries */ Retries, 
          /* args */ js.UndefOr[js.Array[Any]], 
          js.Promise[Any]
        ],
      executeHooksWithArgs: FnCall
    ): WrapperMethods = {
      val __obj = js.Dynamic.literal(executeAsync = executeAsync.asInstanceOf[js.Any], executeHooksWithArgs = executeHooksWithArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WrapperMethods] (val x: Self) extends AnyVal {
      
      inline def setExecuteAsync(
        value: js.ThisFunction3[
              /* this */ Any, 
              /* fn */ js.Function, 
              /* retries */ Retries, 
              /* args */ js.UndefOr[js.Array[Any]], 
              js.Promise[Any]
            ]
      ): Self = StObject.set(x, "executeAsync", value.asInstanceOf[js.Any])
      
      inline def setExecuteHooksWithArgs(value: FnCall): Self = StObject.set(x, "executeHooksWithArgs", value.asInstanceOf[js.Any])
    }
  }
}
