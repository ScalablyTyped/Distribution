package typings.wdioUtils

import typings.node.NodeJS.Global
import typings.wdioUtils.typesMod.AfterHookParam
import typings.wdioUtils.typesMod.BeforeHookParam
import typings.wdioUtils.typesMod.HookFnArgs
import typings.wdioUtils.typesMod.SpecFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testFrameworkMod {
  
  @JSImport("@wdio/utils/build/test-framework", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    fnName: String,
    cid: String,
    scope: Global & (/* globalThis */ js.Any)
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[js.Any],
    args_3: AfterHookParam[js.Any],
    args_4: String,
    args_5: Double
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
