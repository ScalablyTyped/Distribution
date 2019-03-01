package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDefinition extends js.Object {
  /**
    * Gets or sets the data source.
    */
  var dataSource: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValue]
  /**
    * Gets or sets the rest end point.
    */
  var endPoint: java.lang.String
  /**
    * Gets or sets the result template.
    */
  var resultTemplate: java.lang.String
}

object ValueDefinition {
  @scala.inline
  def apply(
    dataSource: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValue],
    endPoint: java.lang.String,
    resultTemplate: java.lang.String
  ): ValueDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSource")(dataSource)
    __obj.updateDynamic("endPoint")(endPoint)
    __obj.updateDynamic("resultTemplate")(resultTemplate)
    __obj.asInstanceOf[ValueDefinition]
  }
}

