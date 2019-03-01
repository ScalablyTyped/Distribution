package typings
package xmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var standalone: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: java.lang.String = null, standalone: java.lang.String = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (standalone != null) __obj.updateDynamic("standalone")(standalone)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

