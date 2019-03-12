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
    whenReady: js.Function0[scala.Unit] => scala.Unit
  ): HTMLImportsPolyfill = {
    val __obj = js.Dynamic.literal(IMPORT_LINK_TYPE = IMPORT_LINK_TYPE, flags = flags, isIE = isIE, ready = ready, rootDocument = rootDocument, useNative = useNative, whenReady = js.Any.fromFunction1(whenReady))
  
    __obj.asInstanceOf[HTMLImportsPolyfill]
  }
}

