package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Lookup value.
  */
trait LookupValue extends js.Object {
  /**
    * Type of the entity.
    */
  var entityType: java.lang.String
  /**
    * The identifier.
    */
  var id: java.lang.String
  /**
    * The name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

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

