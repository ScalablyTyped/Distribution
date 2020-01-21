package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOptions extends js.Object {
  /** API key (if assigned). Contact the WebPageTest server administrator for a key if required */
  var key: js.UndefOr[String] = js.undefined
}

object KeyOptions {
  @scala.inline
  def apply(key: String = null): KeyOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOptions]
  }
}

