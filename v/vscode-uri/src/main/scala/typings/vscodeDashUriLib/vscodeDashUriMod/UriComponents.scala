package typings
package vscodeDashUriLib.vscodeDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriComponents extends js.Object {
  var authority: java.lang.String
  var fragment: java.lang.String
  var path: java.lang.String
  var query: java.lang.String
  var scheme: java.lang.String
}

object UriComponents {
  @scala.inline
  def apply(
    authority: java.lang.String,
    fragment: java.lang.String,
    path: java.lang.String,
    query: java.lang.String,
    scheme: java.lang.String
  ): UriComponents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authority")(authority)
    __obj.updateDynamic("fragment")(fragment)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[UriComponents]
  }
}

