package typings.workboxRangeRequests

import typings.workboxRangeRequests.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsParseRangeHeaderMod {
  
  @JSImport("workbox-range-requests/utils/parseRangeHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {string} rangeHeader A Range: header value.
    * @return {Object} An object with `start` and `end` properties, reflecting
    * the parsed value of the Range: header. If either the `start` or `end` are
    * omitted, then `null` will be returned.
    *
    * @private
    */
  inline def parseRangeHeader(rangeHeader: String): Start = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRangeHeader")(rangeHeader.asInstanceOf[js.Any]).asInstanceOf[Start]
}
