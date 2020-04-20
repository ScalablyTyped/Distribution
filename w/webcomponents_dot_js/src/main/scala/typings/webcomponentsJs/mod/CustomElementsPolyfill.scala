package typings.webcomponentsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomElementsPolyfill extends js.Object {
  var flags: js.Any
  var hasNative: Boolean
  var ready: Boolean
  var useNative: Boolean
}

object CustomElementsPolyfill {
  @scala.inline
  def apply(flags: js.Any, hasNative: Boolean, ready: Boolean, useNative: Boolean): CustomElementsPolyfill = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], hasNative = hasNative.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomElementsPolyfill]
  }
}

