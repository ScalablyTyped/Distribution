package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var abort: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Target url for the upload
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  var allcomplete: js.UndefOr[js.Function2[/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest, _]] = js.undefined
  /**
    * File filter
    * @default *.*
    * <h2>Possible value</h2>
    * string
    */
  var allow: js.UndefOr[java.lang.String] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* settings */ this.type, 
      /* files */ java.lang.String | js.Array[java.lang.String], 
      _
    ]
  ] = js.undefined
  var beforeAll: js.UndefOr[js.Function1[/* files */ java.lang.String | js.Array[java.lang.String], _]] = js.undefined
  var beforeSend: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, _]] = js.undefined
  var complete: js.UndefOr[js.Function2[/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest, _]] = js.undefined
  var error: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Limit the number of files to upload
    * @default false
    * <h2>Possible value</h2>
    * integer
    */
  var filelimit: js.UndefOr[scala.Double] = js.undefined
  var load: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var loadend: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var loadstart: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var notallowed: js.UndefOr[
    js.Function2[
      /* file */ java.lang.String | js.Array[java.lang.String], 
      /* settings */ this.type, 
      _
    ]
  ] = js.undefined
  /**
    * Post query name
    * @default files[]
    * <h2>Possible value</h2>
    * string
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional request parameters
    * @default {}
    * <h2>Possible value</h2>
    * JSON Object
    */
  var params: js.UndefOr[js.Object] = js.undefined
  var progress: js.UndefOr[js.Function1[/* percent */ scala.Double, _]] = js.undefined
  var readystatechange: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Send each file one by one
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var single: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Response type from server
    * @default text
    * <h2>Possible Value</h2>
    * (text|json)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

