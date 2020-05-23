package typings.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripOkuriganaOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var matchKanji: js.UndefOr[String] = js.undefined
}

object StripOkuriganaOptions {
  @scala.inline
  def apply(leading: js.UndefOr[Boolean] = js.undefined, matchKanji: String = null): StripOkuriganaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (matchKanji != null) __obj.updateDynamic("matchKanji")(matchKanji.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripOkuriganaOptions]
  }
}

