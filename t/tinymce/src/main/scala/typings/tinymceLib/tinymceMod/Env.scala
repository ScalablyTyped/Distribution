package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var android: scala.Boolean
  var ceFalse: scala.Boolean
  var contentEditable: scala.Boolean
  var documentMode: scala.Boolean
  var fileApi: scala.Boolean
  var gecko: scala.Boolean
  var iOS: scala.Boolean
  var ie: scala.Boolean
  var mac: scala.Boolean
  var noCaretAfter: scala.Boolean
  var opera: scala.Boolean
  var range: scala.Boolean
  var transparentSrc: scala.Boolean
  var webKit: scala.Boolean
}

object Env {
  @scala.inline
  def apply(
    android: scala.Boolean,
    ceFalse: scala.Boolean,
    contentEditable: scala.Boolean,
    documentMode: scala.Boolean,
    fileApi: scala.Boolean,
    gecko: scala.Boolean,
    iOS: scala.Boolean,
    ie: scala.Boolean,
    mac: scala.Boolean,
    noCaretAfter: scala.Boolean,
    opera: scala.Boolean,
    range: scala.Boolean,
    transparentSrc: scala.Boolean,
    webKit: scala.Boolean
  ): Env = {
    val __obj = js.Dynamic.literal(android = android, ceFalse = ceFalse, contentEditable = contentEditable, documentMode = documentMode, fileApi = fileApi, gecko = gecko, iOS = iOS, ie = ie, mac = mac, noCaretAfter = noCaretAfter, opera = opera, range = range, transparentSrc = transparentSrc, webKit = webKit)
  
    __obj.asInstanceOf[Env]
  }
}

