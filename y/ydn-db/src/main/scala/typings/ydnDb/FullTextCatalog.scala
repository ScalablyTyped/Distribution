package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullTextCatalog extends js.Object {
  var lang: String
  var name: String
  var sources: js.Array[FullTextSource]
}

object FullTextCatalog {
  @scala.inline
  def apply(lang: String, name: String, sources: js.Array[FullTextSource]): FullTextCatalog = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextCatalog]
  }
}

