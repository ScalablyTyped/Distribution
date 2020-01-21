package typings.uirouterCore.urlInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlParts extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var path: String
  var search: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UrlParts {
  @scala.inline
  def apply(path: String, hash: String = null, search: StringDictionary[js.Any] = null): UrlParts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlParts]
  }
}

