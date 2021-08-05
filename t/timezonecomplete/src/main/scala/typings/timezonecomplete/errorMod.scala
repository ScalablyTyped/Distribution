package typings.timezonecomplete

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("timezonecomplete/dist/lib/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertError[T](errorName: String, cb: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("convertError")(errorName.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def error(name: String, format: String, args: js.Any*): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def errorIs(error: Error, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("errorIs")(error.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def errorIs(error: Error, name: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("errorIs")(error.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def throwError(name: String, format: String, args: js.Any*): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
}
