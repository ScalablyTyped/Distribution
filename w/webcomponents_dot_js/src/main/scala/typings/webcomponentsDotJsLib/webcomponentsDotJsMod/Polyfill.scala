package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyfill extends js.Object {
  var flags: js.Any
}

object Polyfill {
  @scala.inline
  def apply(flags: js.Any): Polyfill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Polyfill]
  }
}

