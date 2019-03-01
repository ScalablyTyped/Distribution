package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fs extends js.Object {
  var fs: js.UndefOr[scala.Double] = js.undefined
  var http: js.UndefOr[scala.Double] = js.undefined
  var https: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Fs {
  @scala.inline
  def apply(
    fs: scala.Int | scala.Double = null,
    http: scala.Int | scala.Double = null,
    https: scala.Int | scala.Double = null
  ): Anon_Fs = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fs]
  }
}

