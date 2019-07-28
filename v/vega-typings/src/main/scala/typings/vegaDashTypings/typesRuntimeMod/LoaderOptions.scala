package typings.vegaDashTypings.typesRuntimeMod

import typings.std.RequestInit
import typings.vegaDashTypings.vegaDashTypingsStrings.file
import typings.vegaDashTypings.vegaDashTypingsStrings.http
import typings.vegaDashTypings.vegaDashTypingsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var defaultProtocol: js.UndefOr[http | https | String] = js.undefined
  var http: js.UndefOr[RequestInit] = js.undefined
  var mode: js.UndefOr[file | http] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    baseURL: String = null,
    defaultProtocol: http | https | String = null,
    http: RequestInit = null,
    mode: file | http = null,
    target: String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LoaderOptions]
  }
}

