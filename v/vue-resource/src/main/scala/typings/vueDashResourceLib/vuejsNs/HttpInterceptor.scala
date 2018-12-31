package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpInterceptor extends js.Object {
  var request: js.UndefOr[js.Function1[/* request */ HttpOptions, HttpOptions]] = js.undefined
  var response: js.UndefOr[js.Function1[/* response */ HttpResponse, HttpResponse]] = js.undefined
}

