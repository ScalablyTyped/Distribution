package typings.xmlbuilder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    version: java.lang.String = null
  ): Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

