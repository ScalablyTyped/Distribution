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
    val __obj = js.Dynamic.literal(name = name)
    if (partner_id != null) __obj.updateDynamic("partner_id")(partner_id)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_NamePartnerid]
  }
}

