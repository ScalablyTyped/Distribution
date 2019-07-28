package typings.xmlbuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String = null, standalone: js.UndefOr[Boolean] = js.undefined, version: String = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

