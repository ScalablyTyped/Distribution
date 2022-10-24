package typings.wdioUtils

import typings.wdioUtils.buildTestFrameworkTypesMod.AfterHookParam
import typings.wdioUtils.buildTestFrameworkTypesMod.BeforeHookParam
import typings.wdioUtils.buildTestFrameworkTypesMod.SpecFunction
import typings.wdioUtils.buildTestFrameworkTypesMod.WrapperMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTestFrameworkTestFnWrapperMod {
  
  @JSImport("@wdio/utils/build/test-framework/testFnWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterStackTrace(stack: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterStackTrace")(stack.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[Any],
    args_3: AfterHookParam[Any],
    args_4: String,
    args_5: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def testFrameworkFnWrapper(
    param1: WrapperMethods,
    `type`: String,
    param3: SpecFunction,
    param4: BeforeHookParam[Any],
    param5: AfterHookParam[Any],
    cid: String
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFrameworkFnWrapper")(param1.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], param3.asInstanceOf[js.Any], param4.asInstanceOf[js.Any], param5.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def testFrameworkFnWrapper(
    param1: WrapperMethods,
    `type`: String,
    param3: SpecFunction,
    param4: BeforeHookParam[Any],
    param5: AfterHookParam[Any],
    cid: String,
    repeatTest: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFrameworkFnWrapper")(param1.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], param3.asInstanceOf[js.Any], param4.asInstanceOf[js.Any], param5.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], repeatTest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
