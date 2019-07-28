package typings.vscodeDashUri.vscodeDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriComponents extends js.Object {
  var authority: String
  var fragment: String
  var path: String
  var query: String
  var scheme: String
}

object UriComponents {
  @scala.inline
  def apply(authority: String, fragment: String, path: String, query: String, scheme: String): UriComponents = {
    val __obj = js.Dynamic.literal(authority = authority, fragment = fragment, path = path, query = query, scheme = scheme)
  
    __obj.asInstanceOf[UriComponents]
  }
}

