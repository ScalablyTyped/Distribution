package typings.xml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[String] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: String = null, standalone: String = null): Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

