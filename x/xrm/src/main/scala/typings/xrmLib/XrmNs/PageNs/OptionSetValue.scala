package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an OptionSet value.
  * @deprecated Use {@link Xrm.OptionSetValue} instead.
  */
trait OptionSetValue
  extends xrmLib.XrmNs.OptionSetValue

object OptionSetValue {
  @scala.inline
  def apply(text: java.lang.String, value: scala.Double): OptionSetValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionSetValue]
  }
}

