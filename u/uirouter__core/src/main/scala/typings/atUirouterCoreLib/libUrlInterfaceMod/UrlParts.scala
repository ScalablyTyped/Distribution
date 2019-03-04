package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlParts extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
  var search: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object UrlParts {
  @scala.inline
  def apply(
    path: java.lang.String,
    hash: java.lang.String = null,
    search: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): UrlParts = {
    val __obj = js.Dynamic.literal(path = path)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[UrlParts]
  }
}

