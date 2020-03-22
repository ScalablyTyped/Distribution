package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitUploadOptions extends js.Object {
  var abort: js.UndefOr[js.Object] = js.undefined
  var allow: js.UndefOr[String | Boolean] = js.undefined
  var `before-all`: js.UndefOr[js.Object] = js.undefined
  var `before-send`: js.UndefOr[js.Object] = js.undefined
  var `cls-dragover`: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[js.Object] = js.undefined
  var `complete-all`: js.UndefOr[js.Object] = js.undefined
  var concurrent: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[js.Object] = js.undefined
  var fail: js.UndefOr[js.Object] = js.undefined
  var load: js.UndefOr[js.Object] = js.undefined
  var `load-end`: js.UndefOr[js.Object] = js.undefined
  var `load-start`: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mime: js.UndefOr[String | Boolean] = js.undefined
  var `msg-invalid-mime`: js.UndefOr[String] = js.undefined
  var `msg-invalid-name`: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var progress: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object UIkitUploadOptions {
  @scala.inline
  def apply(
    abort: js.Object = null,
    allow: String | Boolean = null,
    `before-all`: js.Object = null,
    `before-send`: js.Object = null,
    `cls-dragover`: String = null,
    complete: js.Object = null,
    `complete-all`: js.Object = null,
    concurrent: Int | Double = null,
    error: js.Object = null,
    fail: js.Object = null,
    load: js.Object = null,
    `load-end`: js.Object = null,
    `load-start`: js.Object = null,
    method: String = null,
    mime: String | Boolean = null,
    `msg-invalid-mime`: String = null,
    `msg-invalid-name`: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    params: js.Object = null,
    progress: js.Object = null,
    `type`: String = null,
    url: String = null
  ): UIkitUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort.asInstanceOf[js.Any])
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (`before-all` != null) __obj.updateDynamic("before-all")(`before-all`.asInstanceOf[js.Any])
    if (`before-send` != null) __obj.updateDynamic("before-send")(`before-send`.asInstanceOf[js.Any])
    if (`cls-dragover` != null) __obj.updateDynamic("cls-dragover")(`cls-dragover`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (`complete-all` != null) __obj.updateDynamic("complete-all")(`complete-all`.asInstanceOf[js.Any])
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (`load-end` != null) __obj.updateDynamic("load-end")(`load-end`.asInstanceOf[js.Any])
    if (`load-start` != null) __obj.updateDynamic("load-start")(`load-start`.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (`msg-invalid-mime` != null) __obj.updateDynamic("msg-invalid-mime")(`msg-invalid-mime`.asInstanceOf[js.Any])
    if (`msg-invalid-name` != null) __obj.updateDynamic("msg-invalid-name")(`msg-invalid-name`.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitUploadOptions]
  }
}

