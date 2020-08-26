package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for the <Titanium.UI.TextField.padding> that describes the padding. Most notable difference from typical <Padding> is that `top`/`bottom` are only supported on Android.
  */
@js.native
trait TextFieldPadding extends Padding

object TextFieldPadding {
  @scala.inline
  def apply(): TextFieldPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldPadding]
  }
}

