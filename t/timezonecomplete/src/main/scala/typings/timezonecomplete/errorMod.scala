package typings.timezonecomplete

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("timezonecomplete/dist/lib/error", "convertError")
  @js.native
  def convertError[T](errorName: String, cb: js.Function0[T]): T = js.native
  
  @JSImport("timezonecomplete/dist/lib/error", "error")
  @js.native
  def error(name: String, format: String, args: js.Any*): Error = js.native
  
  @JSImport("timezonecomplete/dist/lib/error", "errorIs")
  @js.native
  def errorIs(error: Error, name: String): Boolean = js.native
  @JSImport("timezonecomplete/dist/lib/error", "errorIs")
  @js.native
  def errorIs(error: Error, name: js.Array[String]): Boolean = js.native
  
  @JSImport("timezonecomplete/dist/lib/error", "throwError")
  @js.native
  def throwError(name: String, format: String, args: js.Any*): scala.Nothing = js.native
}
