package typings.winrtUwp.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages all aspects of handwriting recognition. */
@js.native
trait InkRecognizer extends js.Object {
  /** Gets the name of the InkRecognizer . */
  var name: String = js.native
}

object InkRecognizer {
  @scala.inline
  def apply(name: String): InkRecognizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkRecognizer]
  }
  @scala.inline
  implicit class InkRecognizerOps[Self <: InkRecognizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

