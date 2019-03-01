package typings
package webprogbaseDashConsoleDashViewLib.webprogbaseDashConsoleDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFieldDescriptor extends js.Object {
  var auto: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var description: java.lang.String
}

object FormFieldDescriptor {
  @scala.inline
  def apply(description: java.lang.String, auto: java.lang.String = null, default: java.lang.String = null): FormFieldDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    if (auto != null) __obj.updateDynamic("auto")(auto)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[FormFieldDescriptor]
  }
}

