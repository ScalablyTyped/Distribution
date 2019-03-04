package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomElementsPolyfill extends js.Object {
  var flags: js.Any
  var hasNative: scala.Boolean
  var ready: scala.Boolean
  var useNative: scala.Boolean
}

object CustomElementsPolyfill {
  @scala.inline
  def apply(flags: js.Any, hasNative: scala.Boolean, ready: scala.Boolean, useNative: scala.Boolean): CustomElementsPolyfill = {
    val __obj = js.Dynamic.literal(flags = flags, hasNative = hasNative, ready = ready, useNative = useNative)
  
    __obj.asInstanceOf[CustomElementsPolyfill]
  }
}

