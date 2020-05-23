package typings.winrtUwp.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages all aspects of handwriting recognition. */
trait InkRecognizer extends js.Object {
  /** Gets the name of the InkRecognizer . */
  var name: String
}

object InkRecognizer {
  @scala.inline
  def apply(name: String): InkRecognizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkRecognizer]
  }
}

