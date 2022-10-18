package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientFunction[R, A /* <: js.Array[Any] */] extends StObject {
  
  /**
    * Client function
    *
    * @param args - Function arguments.
    */
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
  ): js.Promise[R] = js.native
  
  /**
    * Returns a new client function with a different set of options that includes options from the
    * original function and new `options` that overwrite the original ones.
    *
    * @param options - New options.
    */
  def `with`(options: ClientFunctionOptions): ClientFunction[R, A] = js.native
}
object ClientFunction {
  
  inline def apply: ClientFunctionFactory = js.Dynamic.global.selectDynamic("ClientFunction").asInstanceOf[ClientFunctionFactory]
}
