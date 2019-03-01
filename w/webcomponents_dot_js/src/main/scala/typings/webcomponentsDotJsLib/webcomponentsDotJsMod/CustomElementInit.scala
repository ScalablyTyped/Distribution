package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomElementInit extends js.Object {
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
}

object CustomElementInit {
  @scala.inline
  def apply(`extends`: java.lang.String = null): CustomElementInit = {
    val __obj = js.Dynamic.literal()
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    __obj.asInstanceOf[CustomElementInit]
  }
}

