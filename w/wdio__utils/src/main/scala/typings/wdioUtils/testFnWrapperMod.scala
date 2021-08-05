package typings.wdioUtils

import typings.wdioUtils.typesMod.AfterHookParam
import typings.wdioUtils.typesMod.BeforeHookParam
import typings.wdioUtils.typesMod.SpecFunction
import typings.wdioUtils.typesMod.WrapperMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testFnWrapperMod {
  
  @JSImport("@wdio/utils/build/test-framework/testFnWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[js.Any],
    args_3: AfterHookParam[js.Any],
    args_4: String,
    args_5: Double
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def testFrameworkFnWrapper(
    hasExecuteHooksWithArgsExecuteAsyncRunSync: WrapperMethods,
    `type`: String,
    hasSpecFnSpecFnArgs: SpecFunction,
    hasBeforeFnBeforeFnArgs: BeforeHookParam[js.Any],
    hasAfterFnAfterFnArgs: AfterHookParam[js.Any],
    cid: String
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFrameworkFnWrapper")(hasExecuteHooksWithArgsExecuteAsyncRunSync.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], hasSpecFnSpecFnArgs.asInstanceOf[js.Any], hasBeforeFnBeforeFnArgs.asInstanceOf[js.Any], hasAfterFnAfterFnArgs.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def testFrameworkFnWrapper(
    hasExecuteHooksWithArgsExecuteAsyncRunSync: WrapperMethods,
    `type`: String,
    hasSpecFnSpecFnArgs: SpecFunction,
    hasBeforeFnBeforeFnArgs: BeforeHookParam[js.Any],
    hasAfterFnAfterFnArgs: AfterHookParam[js.Any],
    cid: String,
    repeatTest: Double
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFrameworkFnWrapper")(hasExecuteHooksWithArgsExecuteAsyncRunSync.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], hasSpecFnSpecFnArgs.asInstanceOf[js.Any], hasBeforeFnBeforeFnArgs.asInstanceOf[js.Any], hasAfterFnAfterFnArgs.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], repeatTest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
