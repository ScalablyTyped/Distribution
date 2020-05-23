package typings.wegameApi.wx.types

import typings.wegameApi.anon.TempFilePath
import typings.wegameApi.wegameApiStrings.jpg
import typings.wegameApi.wegameApiStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToTempFileParams extends ToTempFileSyncParams {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ TempFilePath, Unit]] = js.undefined
}

object ToTempFileParams {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    destHeight: js.UndefOr[Double] = js.undefined,
    destWidth: js.UndefOr[Double] = js.undefined,
    fail: () => Unit = null,
    fileType: jpg | png = null,
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    success: /* res */ TempFilePath => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ToTempFileParams = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(destHeight)) __obj.updateDynamic("destHeight")(destHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destWidth)) __obj.updateDynamic("destWidth")(destWidth.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFileParams]
  }
}

