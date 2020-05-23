package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorBaseSetting extends js.Object {
  var name: String
  var slug: String
}

object EditorBaseSetting {
  @scala.inline
  def apply(name: String, slug: String): EditorBaseSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorBaseSetting]
  }
}

