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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android")(android)
    __obj.updateDynamic("ceFalse")(ceFalse)
    __obj.updateDynamic("contentEditable")(contentEditable)
    __obj.updateDynamic("documentMode")(documentMode)
    __obj.updateDynamic("fileApi")(fileApi)
    __obj.updateDynamic("gecko")(gecko)
    __obj.updateDynamic("iOS")(iOS)
    __obj.updateDynamic("ie")(ie)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("noCaretAfter")(noCaretAfter)
    __obj.updateDynamic("opera")(opera)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("transparentSrc")(transparentSrc)
    __obj.updateDynamic("webKit")(webKit)
    __obj.asInstanceOf[Env]
  }
}

