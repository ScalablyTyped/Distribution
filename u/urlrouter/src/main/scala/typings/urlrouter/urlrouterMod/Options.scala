package typings.urlrouter.urlrouterMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function3[/* err */ Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
  ] = js.undefined
  var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.undefined
  var paramsName: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    errorHandler: (/* err */ Error, /* req */ ServerRequest, /* res */ ServerResponse) => Unit = null,
    pageNotFound: (/* req */ ServerRequest, /* res */ ServerResponse) => Unit = null,
    paramsName: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction3(errorHandler))
    if (pageNotFound != null) __obj.updateDynamic("pageNotFound")(js.Any.fromFunction2(pageNotFound))
    if (paramsName != null) __obj.updateDynamic("paramsName")(paramsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

