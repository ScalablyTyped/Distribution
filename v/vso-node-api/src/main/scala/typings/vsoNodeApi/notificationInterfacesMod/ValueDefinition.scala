package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDefinition extends js.Object {
  /**
    * Gets or sets the data source.
    */
  var dataSource: js.Array[InputValue]
  /**
    * Gets or sets the rest end point.
    */
  var endPoint: String
  /**
    * Gets or sets the result template.
    */
  var resultTemplate: String
}

object ValueDefinition {
  @scala.inline
  def apply(dataSource: js.Array[InputValue], endPoint: String, resultTemplate: String): ValueDefinition = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValueDefinition]
  }
}

