package typings.wdioUtils

import typings.node.NodeJS.Global
import typings.wdioUtils.typesMod.HookFnArgs
import typings.wdioUtils.typesMod.SpecArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testInterfaceWrapperMod {
  
  @JSImport("@wdio/utils/build/test-framework/testInterfaceWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runHook(
    hookFn: js.Function,
    origFn: js.Function,
    beforeFn: js.Function,
    beforeFnArgs: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterFnArgs: HookFnArgs[js.Any],
    cid: String,
    repeatTest: Double
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runHook")(hookFn.asInstanceOf[js.Any], origFn.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeFnArgs.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterFnArgs.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], repeatTest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def runSpec(
    specTitle: String,
    specFn: js.Function,
    origFn: js.Function,
    beforeFn: js.Function,
    beforeFnArgs: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterFnArgs: HookFnArgs[js.Any],
    cid: String,
    repeatTest: Double
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runSpec")(specTitle.asInstanceOf[js.Any], specFn.asInstanceOf[js.Any], origFn.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeFnArgs.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterFnArgs.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], repeatTest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    fnName: String,
    cid: String,
    scope: Global & (/* globalThis */ js.Any)
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wrapTestFunction(
    origFn: js.Function,
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    cid: String
  ): js.Function1[/* specArguments */ SpecArguments, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTestFunction")(origFn.asInstanceOf[js.Any], isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* specArguments */ SpecArguments, js.Any]]
}
