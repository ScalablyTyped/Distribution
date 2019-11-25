package typings.webcomponentsDotJs.webcomponentsDotJsMod

import typings.webcomponentsDotJs.webcomponentsDotJsMod._Global_.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLImportsPolyfill extends js.Object {
  var IMPORT_LINK_TYPE: String
  var flags: js.Any
  var isIE: Boolean
  var ready: Boolean
  var rootDocument: Document
  var useNative: Boolean
  def whenReady(callback: js.Function0[Unit]): Unit
}

object HTMLImportsPolyfill {
  @scala.inline
  def apply(
    IMPORT_LINK_TYPE: String,
    flags: js.Any,
    isIE: Boolean,
    ready: Boolean,
    rootDocument: Document,
    useNative: Boolean,
    whenReady: js.Function0[Unit] => Unit
  ): HTMLImportsPolyfill = {
    val __obj = js.Dynamic.literal(IMPORT_LINK_TYPE = IMPORT_LINK_TYPE.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rootDocument = rootDocument.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any], whenReady = js.Any.fromFunction1(whenReady))
  
    __obj.asInstanceOf[HTMLImportsPolyfill]
  }
}

