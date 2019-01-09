package typings
package wreckLib.wreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: js.UndefOr[wreckLib.Anon_Http | wreckLib.wreckLibNumbers.`false`] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var beforeRedirect: js.UndefOr[
    js.Function6[
      /* redirectMethod */ java.lang.String, 
      /* statusCode */ scala.Double, 
      /* location */ java.lang.String, 
      /* resHeaders */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      /* redirectOptions */ js.Any, 
      /* next */ js.Function0[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var downstreamRes: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var redirect303: js.UndefOr[scala.Boolean] = js.undefined
  var redirected: js.UndefOr[
    js.Function3[
      /* statusCode */ scala.Double, 
      /* location */ java.lang.String, 
      /* req */ nodeLib.httpMod.ClientRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var redirects: js.UndefOr[scala.Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

