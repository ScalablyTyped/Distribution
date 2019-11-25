package typings.xml2js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var version: String
}

object Anon_Encoding {
  @scala.inline
  def apply(version: String, encoding: String = null, standalone: js.UndefOr[Boolean] = js.undefined): Anon_Encoding = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

