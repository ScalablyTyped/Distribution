package typings
package urlrouterLib.urlrouterMod.UrlRouterInternalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function3[/* err */ stdLib.Error, /* req */ ServerRequest, /* res */ ServerResponse, scala.Unit]
  ] = js.undefined
  var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, scala.Unit]] = js.undefined
  var paramsName: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    errorHandler: (/* err */ stdLib.Error, /* req */ ServerRequest, /* res */ ServerResponse) => scala.Unit = null,
    pageNotFound: (/* req */ ServerRequest, /* res */ ServerResponse) => scala.Unit = null,
    paramsName: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction3(errorHandler))
    if (pageNotFound != null) __obj.updateDynamic("pageNotFound")(js.Any.fromFunction2(pageNotFound))
    if (paramsName != null) __obj.updateDynamic("paramsName")(paramsName)
    __obj.asInstanceOf[Options]
  }
}

