package typings.textract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  /**
    *  A pass-through to tesseract allowing for setting of language for extraction.
    */
  var lang: String
}

object Lang {
  @scala.inline
  def apply(lang: String): Lang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
}

