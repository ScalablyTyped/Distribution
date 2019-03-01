package typings
package textractLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lang extends js.Object {
  /**
    *  A pass-through to tesseract allowing for setting of language for extraction.
    */
  var lang: java.lang.String
}

object Anon_Lang {
  @scala.inline
  def apply(lang: java.lang.String): Anon_Lang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Anon_Lang]
  }
}

