package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_TempFilePath
import typings.wegameDashApi.wegameDashApiStrings.jpg
import typings.wegameDashApi.wegameDashApiStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToTempFileParams extends ToTempFileSyncParams {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_TempFilePath, Unit]] = js.undefined
}

object ToTempFileParams {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    destHeight: Int | Double = null,
    destWidth: Int | Double = null,
    fail: () => Unit = null,
    fileType: jpg | png = null,
    height: Int | Double = null,
    quality: Int | Double = null,
    success: /* res */ Anon_TempFilePath => Unit = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ToTempFileParams = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFileParams]
  }
}

