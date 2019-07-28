package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEdit extends js.Object {
  /**
    * The string to be inserted. For delete operations use an
    * empty string.
    */
  var newText: String
  /**
    * The range of the text document to be manipulated. To insert
    * text into a document create a range where start === end.
    */
  var range: Range
}

object TextEdit {
  @scala.inline
  def apply(newText: String, range: Range): TextEdit = {
    val __obj = js.Dynamic.literal(newText = newText, range = range)
  
    __obj.asInstanceOf[TextEdit]
  }
}

