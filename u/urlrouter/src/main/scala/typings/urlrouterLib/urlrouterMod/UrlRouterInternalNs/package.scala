package typings
package urlrouterLib.urlrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UrlRouterInternalNs {
  type HttpHandler = js.Function3[
    /* req */ ServerRequest, 
    /* res */ ServerResponse, 
    /* next */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
}
