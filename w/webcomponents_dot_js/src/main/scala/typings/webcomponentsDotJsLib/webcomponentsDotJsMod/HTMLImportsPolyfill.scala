package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLImportsPolyfill extends js.Object {
  var IMPORT_LINK_TYPE: java.lang.String
  var flags: js.Any
  var isIE: scala.Boolean
  var ready: scala.Boolean
  var rootDocument: webcomponentsDotJsLib.webcomponentsDotJsMod.Global.Document
  var useNative: scala.Boolean
  def whenReady(callback: js.Function0[scala.Unit]): scala.Unit
}

object HTMLImportsPolyfill {
  @scala.inline
  def apply(
    IMPORT_LINK_TYPE: java.lang.String,
    flags: js.Any,
    isIE: scala.Boolean,
    ready: scala.Boolean,
    rootDocument: webcomponentsDotJsLib.webcomponentsDotJsMod.Global.Document,
    useNative: scala.Boolean,
    whenReady: js.Function1[js.Function0[scala.Unit], scala.Unit]
  ): HTMLImportsPolyfill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IMPORT_LINK_TYPE")(IMPORT_LINK_TYPE)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("isIE")(isIE)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("rootDocument")(rootDocument)
    __obj.updateDynamic("useNative")(useNative)
    __obj.updateDynamic("whenReady")(whenReady)
    __obj.asInstanceOf[HTMLImportsPolyfill]
  }
}

