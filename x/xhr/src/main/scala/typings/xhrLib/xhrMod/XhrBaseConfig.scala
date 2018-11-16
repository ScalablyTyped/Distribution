package typings
package xhrLib.xhrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XhrBaseConfig extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
  var body: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var headers: js.UndefOr[XhrHeaders] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[
    xhrLib.xhrLibStrings.DELETE | xhrLib.xhrLibStrings.GET | xhrLib.xhrLibStrings.HEAD | xhrLib.xhrLibStrings.OPTIONS | xhrLib.xhrLibStrings.POST | xhrLib.xhrLibStrings.PUT
  ] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[
    xhrLib.xhrLibStrings.Empty | xhrLib.xhrLibStrings.arraybuffer | xhrLib.xhrLibStrings.blob | xhrLib.xhrLibStrings.document | xhrLib.xhrLibStrings.json | xhrLib.xhrLibStrings.text
  ] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useXDR: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  var xhr: js.UndefOr[stdLib.XMLHttpRequest] = js.undefined
}

