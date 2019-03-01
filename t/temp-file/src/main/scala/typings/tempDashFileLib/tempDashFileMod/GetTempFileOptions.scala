package typings
package tempDashFileLib.tempDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileOptions extends js.Object {
  var disposer: js.UndefOr[(js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]]) | scala.Null] = js.undefined
  var prefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var suffix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object GetTempFileOptions {
  @scala.inline
  def apply(
    disposer: js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]] = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null
  ): GetTempFileOptions = {
    val __obj = js.Dynamic.literal()
    if (disposer != null) __obj.updateDynamic("disposer")(disposer)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[GetTempFileOptions]
  }
}

