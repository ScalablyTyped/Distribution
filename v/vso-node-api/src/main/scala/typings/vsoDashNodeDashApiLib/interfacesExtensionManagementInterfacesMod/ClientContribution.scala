package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContribution extends js.Object {
  /**
    * Description of the contribution/type
    */
  var description: java.lang.String
  /**
    * Fully qualified identifier of the contribution/type
    */
  var id: java.lang.String
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[java.lang.String]
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[java.lang.String]
  /**
    * Id of the Contribution Type
    */
  var `type`: java.lang.String
}

object ClientContribution {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    includes: js.Array[java.lang.String],
    properties: js.Any,
    targets: js.Array[java.lang.String],
    `type`: java.lang.String
  ): ClientContribution = {
    val __obj = js.Dynamic.literal(description = description, id = id, includes = includes, properties = properties, targets = targets)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClientContribution]
  }
}

