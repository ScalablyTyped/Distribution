package typings.wdioUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorHandlerMod {
  
  @JSImport("@wdio/utils/build/test-framework/errorHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logHookError(hookName: String, hookResults: js.Array[Any], cid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logHookError")(hookName.asInstanceOf[js.Any], hookResults.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logHookError(hookName: String, hookResults: Unit, cid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logHookError")(hookName.asInstanceOf[js.Any], hookResults.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
