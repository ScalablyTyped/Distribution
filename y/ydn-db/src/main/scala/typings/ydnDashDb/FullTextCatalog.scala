package typings.ydnDashDb

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
    val __obj = js.Dynamic.literal(lang = lang, name = name, sources = sources)
  
    __obj.asInstanceOf[FullTextCatalog]
  }
}

