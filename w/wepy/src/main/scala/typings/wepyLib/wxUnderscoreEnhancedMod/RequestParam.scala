package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParam extends UrlParam {
  var data: js.UndefOr[js.Object | java.lang.String | stdLib.ArrayBuffer] = js.undefined
  var dataType: js.UndefOr[wepyLib.wepyLibStrings.json | wepyLib.wepyLibStrings.text] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[
    wepyLib.wepyLibStrings.GET | wepyLib.wepyLibStrings.OPTIONS | wepyLib.wepyLibStrings.HEAD | wepyLib.wepyLibStrings.POST | wepyLib.wepyLibStrings.PUT | wepyLib.wepyLibStrings.DELETE | wepyLib.wepyLibStrings.TRACE | wepyLib.wepyLibStrings.CONNECT
  ] = js.undefined
  var responseType: js.UndefOr[wepyLib.wepyLibStrings.text | wepyLib.wepyLibStrings.arraybuffer] = js.undefined
}

object RequestParam {
  @scala.inline
  def apply(
    url: java.lang.String,
    data: js.Object | java.lang.String | stdLib.ArrayBuffer = null,
    dataType: wepyLib.wepyLibStrings.json | wepyLib.wepyLibStrings.text = null,
    header: js.Object = null,
    method: wepyLib.wepyLibStrings.GET | wepyLib.wepyLibStrings.OPTIONS | wepyLib.wepyLibStrings.HEAD | wepyLib.wepyLibStrings.POST | wepyLib.wepyLibStrings.PUT | wepyLib.wepyLibStrings.DELETE | wepyLib.wepyLibStrings.TRACE | wepyLib.wepyLibStrings.CONNECT = null,
    responseType: wepyLib.wepyLibStrings.text | wepyLib.wepyLibStrings.arraybuffer = null
  ): RequestParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParam]
  }
}

