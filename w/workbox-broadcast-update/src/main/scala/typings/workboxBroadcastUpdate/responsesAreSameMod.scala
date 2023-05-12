package typings.workboxBroadcastUpdate

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsesAreSameMod {
  
  @JSImport("workbox-broadcast-update/responsesAreSame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given two `Response's`, compares several header values to see if they are
    * the same or not.
    *
    * @param {Response} firstResponse
    * @param {Response} secondResponse
    * @param {Array<string>} headersToCheck
    * @return {boolean}
    *
    * @memberof workbox-broadcast-update
    */
  inline def responsesAreSame(firstResponse: Response, secondResponse: Response, headersToCheck: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("responsesAreSame")(firstResponse.asInstanceOf[js.Any], secondResponse.asInstanceOf[js.Any], headersToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
