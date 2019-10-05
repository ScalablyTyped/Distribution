package typings.xrm.Xrm

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
  var entityType: String
  /**
    * The identifier.
    */
  var id: String
  /**
    * The name
    */
  var name: js.UndefOr[String] = js.undefined
}

object LookupValue {
  @scala.inline
  def apply(entityType: String, id: String, name: String = null): LookupValue = {
    val __obj = js.Dynamic.literal(entityType = entityType, id = id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LookupValue]
  }
}

