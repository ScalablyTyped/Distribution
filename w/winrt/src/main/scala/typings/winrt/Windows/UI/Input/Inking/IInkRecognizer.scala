package typings.winrt.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognizer extends js.Object {
  var name: String
}

object IInkRecognizer {
  @scala.inline
  def apply(name: String): IInkRecognizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkRecognizer]
  }
}

