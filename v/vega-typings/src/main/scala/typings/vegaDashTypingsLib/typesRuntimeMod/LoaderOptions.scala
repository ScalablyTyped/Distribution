package typings
package vegaDashTypingsLib.typesRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var defaultProtocol: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.http | vegaDashTypingsLib.vegaDashTypingsLibStrings.https | java.lang.String
  ] = js.undefined
  var http: js.UndefOr[stdLib.RequestInit] = js.undefined
  var mode: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.file | vegaDashTypingsLib.vegaDashTypingsLibStrings.http
  ] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    baseURL: java.lang.String = null,
    defaultProtocol: vegaDashTypingsLib.vegaDashTypingsLibStrings.http | vegaDashTypingsLib.vegaDashTypingsLibStrings.https | java.lang.String = null,
    http: stdLib.RequestInit = null,
    mode: vegaDashTypingsLib.vegaDashTypingsLibStrings.file | vegaDashTypingsLib.vegaDashTypingsLibStrings.http = null,
    target: java.lang.String = null
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

