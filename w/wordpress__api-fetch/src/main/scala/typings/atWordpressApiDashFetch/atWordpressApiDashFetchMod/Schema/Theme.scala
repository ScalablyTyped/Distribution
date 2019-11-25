package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_Formats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var theme_supports: Anon_Formats
}

object Theme {
  @scala.inline
  def apply(theme_supports: Anon_Formats): Theme = {
    val __obj = js.Dynamic.literal(theme_supports = theme_supports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Theme]
  }
}

