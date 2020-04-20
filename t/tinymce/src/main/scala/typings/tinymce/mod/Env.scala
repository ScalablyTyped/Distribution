package typings.tinymce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var android: Boolean
  var ceFalse: Boolean
  var contentEditable: Boolean
  var documentMode: Boolean
  var fileApi: Boolean
  var gecko: Boolean
  var iOS: Boolean
  var ie: Boolean
  var mac: Boolean
  var noCaretAfter: Boolean
  var opera: Boolean
  var range: Boolean
  var transparentSrc: Boolean
  var webKit: Boolean
}

object Env {
  @scala.inline
  def apply(
    android: Boolean,
    ceFalse: Boolean,
    contentEditable: Boolean,
    documentMode: Boolean,
    fileApi: Boolean,
    gecko: Boolean,
    iOS: Boolean,
    ie: Boolean,
    mac: Boolean,
    noCaretAfter: Boolean,
    opera: Boolean,
    range: Boolean,
    transparentSrc: Boolean,
    webKit: Boolean
  ): Env = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ceFalse = ceFalse.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], documentMode = documentMode.asInstanceOf[js.Any], fileApi = fileApi.asInstanceOf[js.Any], gecko = gecko.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], noCaretAfter = noCaretAfter.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], transparentSrc = transparentSrc.asInstanceOf[js.Any], webKit = webKit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
}

