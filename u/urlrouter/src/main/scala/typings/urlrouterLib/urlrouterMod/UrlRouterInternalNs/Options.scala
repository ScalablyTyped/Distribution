package typings
package urlrouterLib.urlrouterMod.UrlRouterInternalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function3[/* err */ nodeLib.Error, /* req */ ServerRequest, /* res */ ServerResponse, scala.Unit]
  ] = js.undefined
  var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, scala.Unit]] = js.undefined
  var paramsName: js.UndefOr[java.lang.String] = js.undefined
}

