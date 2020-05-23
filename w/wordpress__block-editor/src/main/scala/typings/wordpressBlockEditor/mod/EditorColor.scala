package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorColor extends EditorBaseSetting {
  var color: String
}

object EditorColor {
  @scala.inline
  def apply(color: String, name: String, slug: String): EditorColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorColor]
  }
}

