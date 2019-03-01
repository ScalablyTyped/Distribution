package typings
package xml2jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
  var version: java.lang.String
}

object Anon_Encoding {
  @scala.inline
  def apply(
    version: java.lang.String,
    encoding: java.lang.String = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("version")(version)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

