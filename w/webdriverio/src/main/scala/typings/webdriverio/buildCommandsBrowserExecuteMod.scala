package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserExecuteMod {
  
  @JSImport("webdriverio/build/commands/browser/execute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ReturnValue, InnerArguments /* <: js.Array[Any] */](
    script: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): js.Promise[ReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue]]
  inline def default[ReturnValue, InnerArguments /* <: js.Array[Any] */](
    script: js.Function1[/* innerArgs */ InnerArguments, ReturnValue],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): js.Promise[ReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue]]
}
