package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Lookup value.
  * @deprecated Use {@link Xrm.LookupValue} instead.
  */
trait LookupValue
  extends xrmLib.XrmNs.LookupValue

object LookupValue {
  @scala.inline
  def apply(entityType: java.lang.String, id: java.lang.String, name: java.lang.String = null): LookupValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entityType")(entityType)
    __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LookupValue]
  }
}

