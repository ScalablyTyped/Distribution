package typings.webdriverio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisScriptArgs extends StObject {
  
  def apply[ReturnValue, InnerArguments /* <: js.Array[Any] */](
    script: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): js.Promise[ReturnValue] = js.native
  def apply[ReturnValue, InnerArguments /* <: js.Array[Any] */](
    script: js.Function1[/* innerArgs */ InnerArguments, ReturnValue],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): js.Promise[ReturnValue] = js.native
}
