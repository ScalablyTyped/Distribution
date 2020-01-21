package typings.xml2js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var version: String
}

object AnonEncoding {
  @scala.inline
  def apply(version: String, encoding: String = null, standalone: js.UndefOr[Boolean] = js.undefined): AnonEncoding = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

