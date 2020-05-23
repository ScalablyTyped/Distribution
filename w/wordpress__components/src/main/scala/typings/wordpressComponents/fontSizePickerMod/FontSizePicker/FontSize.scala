package typings.wordpressComponents.fontSizePickerMod.FontSizePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSize extends js.Object {
  /**
    * Label for the font size (e.g. "Small")
    */
  var name: String
  /**
    * Font size in px.
    */
  var size: Double
  /**
    * A unique identifier for the font size. Used for the class generation
    * process.
    */
  var slug: String
}

object FontSize {
  @scala.inline
  def apply(name: String, size: Double, slug: String): FontSize = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
}

