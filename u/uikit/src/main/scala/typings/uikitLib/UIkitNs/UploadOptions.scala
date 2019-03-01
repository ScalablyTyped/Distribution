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

object UploadOptions {
  @scala.inline
  def apply(
    abort: js.Function1[/* event */ js.Any, _] = null,
    action: java.lang.String = null,
    allcomplete: js.Function2[/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest, _] = null,
    allow: java.lang.String = null,
    before: js.Function2[UploadOptions, /* files */ java.lang.String | js.Array[java.lang.String], _] = null,
    beforeAll: js.Function1[/* files */ java.lang.String | js.Array[java.lang.String], _] = null,
    beforeSend: js.Function1[/* xhr */ stdLib.XMLHttpRequest, _] = null,
    complete: js.Function2[/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest, _] = null,
    error: js.Function1[/* event */ js.Any, _] = null,
    filelimit: scala.Int | scala.Double = null,
    load: js.Function1[/* event */ js.Any, _] = null,
    loadend: js.Function1[/* event */ js.Any, _] = null,
    loadstart: js.Function1[/* event */ js.Any, _] = null,
    notallowed: js.Function2[/* file */ java.lang.String | js.Array[java.lang.String], UploadOptions, _] = null,
    param: java.lang.String = null,
    params: js.Object = null,
    progress: js.Function1[/* percent */ scala.Double, _] = null,
    readystatechange: js.Function1[/* event */ js.Any, _] = null,
    single: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort)
    if (action != null) __obj.updateDynamic("action")(action)
    if (allcomplete != null) __obj.updateDynamic("allcomplete")(allcomplete)
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeAll != null) __obj.updateDynamic("beforeAll")(beforeAll)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filelimit != null) __obj.updateDynamic("filelimit")(filelimit.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadend != null) __obj.updateDynamic("loadend")(loadend)
    if (loadstart != null) __obj.updateDynamic("loadstart")(loadstart)
    if (notallowed != null) __obj.updateDynamic("notallowed")(notallowed)
    if (param != null) __obj.updateDynamic("param")(param)
    if (params != null) __obj.updateDynamic("params")(params)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (readystatechange != null) __obj.updateDynamic("readystatechange")(readystatechange)
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UploadOptions]
  }
}

