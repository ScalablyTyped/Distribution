package typings.textract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLang extends js.Object {
  /**
    *  A pass-through to tesseract allowing for setting of language for extraction.
    */
  var lang: String
}

object AnonLang {
  @scala.inline
  def apply(lang: String): AnonLang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLang]
  }
}

