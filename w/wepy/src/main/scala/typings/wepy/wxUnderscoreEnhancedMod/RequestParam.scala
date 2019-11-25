package typings.wepy.wxUnderscoreEnhancedMod

import typings.std.ArrayBuffer
import typings.wepy.wepyStrings.CONNECT
import typings.wepy.wepyStrings.DELETE
import typings.wepy.wepyStrings.GET
import typings.wepy.wepyStrings.HEAD
import typings.wepy.wepyStrings.OPTIONS
import typings.wepy.wepyStrings.POST
import typings.wepy.wepyStrings.PUT
import typings.wepy.wepyStrings.TRACE
import typings.wepy.wepyStrings.arraybuffer
import typings.wepy.wepyStrings.json
import typings.wepy.wepyStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParam extends UrlParam {
  var data: js.UndefOr[js.Object | String | ArrayBuffer] = js.undefined
  var dataType: js.UndefOr[json | text] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  var responseType: js.UndefOr[text | arraybuffer] = js.undefined
}

object RequestParam {
  @scala.inline
  def apply(
    url: String,
    data: js.Object | String | ArrayBuffer = null,
    dataType: json | text = null,
    header: js.Object = null,
    method: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: text | arraybuffer = null
  ): RequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParam]
  }
}

