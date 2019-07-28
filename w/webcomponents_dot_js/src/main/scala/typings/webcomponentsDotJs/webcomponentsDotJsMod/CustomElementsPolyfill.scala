package typings.webcomponentsDotJs.webcomponentsDotJsMod

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
    val __obj = js.Dynamic.literal(flags = flags, hasNative = hasNative, ready = ready, useNative = useNative)
  
    __obj.asInstanceOf[CustomElementsPolyfill]
  }
}

