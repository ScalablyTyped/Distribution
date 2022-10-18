package typings.wdioUtils

import typings.wdioUtils.buildTestFrameworkTypesMod.AfterHookParam
import typings.wdioUtils.buildTestFrameworkTypesMod.BeforeHookParam
import typings.wdioUtils.buildTestFrameworkTypesMod.HookFnArgs
import typings.wdioUtils.buildTestFrameworkTypesMod.SpecFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTestFrameworkMod {
  
  @JSImport("@wdio/utils/build/test-framework", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[Any],
    args_3: AfterHookParam[Any],
    args_4: String,
    args_5: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
