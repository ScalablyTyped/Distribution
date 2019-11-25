package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_TempImagePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[String] = js.undefined
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ Anon_TempImagePath, Unit]] = js.undefined
}

object TakePhotoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    quality: String = null,
    success: /* res */ Anon_TempImagePath => Unit = null
  ): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TakePhotoOptions]
  }
}

