package typings.xhrMock

import typings.xhrMock.libMockRequestMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatErrorMod {
  
  @JSImport("xhr-mock/lib/formatError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatError(msg: String, req: default): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(msg.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatError(msg: String, req: default, err: js.Error): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(msg.asInstanceOf[js.Any], req.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[String]
}
