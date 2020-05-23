package typings.tempFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileOptions extends js.Object {
  var disposer: js.UndefOr[(js.Function1[/* file */ String, js.Promise[Unit]]) | Null] = js.undefined
  var prefix: js.UndefOr[String | Null] = js.undefined
  var suffix: js.UndefOr[String | Null] = js.undefined
}

object GetTempFileOptions {
  @scala.inline
  def apply(
    disposer: js.UndefOr[Null | (/* file */ String => js.Promise[Unit])] = js.undefined,
    prefix: js.UndefOr[Null | String] = js.undefined,
    suffix: js.UndefOr[Null | String] = js.undefined
  ): GetTempFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disposer)) __obj.updateDynamic("disposer")(if (disposer != null) js.Any.fromFunction1(disposer.asInstanceOf[/* file */ String => js.Promise[Unit]]) else null)
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileOptions]
  }
}

