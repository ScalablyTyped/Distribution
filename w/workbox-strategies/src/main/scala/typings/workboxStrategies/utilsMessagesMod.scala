package typings.workboxStrategies

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMessagesMod {
  
  object messages {
    
    @JSImport("workbox-strategies/utils/messages", "messages")
    @js.native
    val ^ : js.Any = js.native
    
    inline def printFinalResponse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printFinalResponse")().asInstanceOf[Unit]
    inline def printFinalResponse(response: Response): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printFinalResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def strategyStart(strategyName: String, request: Request): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strategyStart")(strategyName.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
