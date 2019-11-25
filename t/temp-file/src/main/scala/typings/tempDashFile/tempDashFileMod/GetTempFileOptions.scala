package typings.tempDashFile.tempDashFileMod

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
    disposer: /* file */ String => js.Promise[Unit] = null,
    prefix: String = null,
    suffix: String = null
  ): GetTempFileOptions = {
    val __obj = js.Dynamic.literal()
    if (disposer != null) __obj.updateDynamic("disposer")(js.Any.fromFunction1(disposer))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileOptions]
  }
}

