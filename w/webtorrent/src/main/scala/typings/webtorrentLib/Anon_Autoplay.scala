package typings
package webtorrentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autoplay extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var maxBlobLength: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Autoplay {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    maxBlobLength: scala.Int | scala.Double = null
  ): Anon_Autoplay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (maxBlobLength != null) __obj.updateDynamic("maxBlobLength")(maxBlobLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Autoplay]
  }
}

