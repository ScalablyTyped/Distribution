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

