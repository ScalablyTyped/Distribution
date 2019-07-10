package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NamePartnerid extends js.Object {
  var name: java.lang.String
  var partner_id: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NamePartnerid {
  @scala.inline
  def apply(
    name: java.lang.String,
    partner_id: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): Anon_NamePartnerid = {
    val __obj = js.Dynamic.literal(name = name)
    if (partner_id != null) __obj.updateDynamic("partner_id")(partner_id)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_NamePartnerid]
  }
}

