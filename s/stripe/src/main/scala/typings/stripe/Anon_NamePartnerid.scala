package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NamePartnerid extends js.Object {
  var name: String
  var partner_id: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_NamePartnerid {
  @scala.inline
  def apply(name: String, partner_id: String = null, url: String = null, version: String = null): Anon_NamePartnerid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (partner_id != null) __obj.updateDynamic("partner_id")(partner_id.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NamePartnerid]
  }
}

