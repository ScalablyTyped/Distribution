package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFontSize extends EditorBaseSetting {
  var size: Double
}

object EditorFontSize {
  @scala.inline
  def apply(name: String, size: Double, slug: String): EditorFontSize = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFontSize]
  }
}

