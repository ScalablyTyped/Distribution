package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullTextCatalog extends js.Object {
  var lang: java.lang.String
  var name: java.lang.String
  var sources: js.Array[FullTextSource]
}

object FullTextCatalog {
  @scala.inline
  def apply(lang: java.lang.String, name: java.lang.String, sources: js.Array[FullTextSource]): FullTextCatalog = {
    val __obj = js.Dynamic.literal(lang = lang, name = name, sources = sources)
  
    __obj.asInstanceOf[FullTextCatalog]
  }
}

