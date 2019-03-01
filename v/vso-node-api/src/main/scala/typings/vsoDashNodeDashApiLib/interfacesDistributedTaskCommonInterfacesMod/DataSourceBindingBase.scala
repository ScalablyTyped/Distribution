package typings
package vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceBindingBase extends js.Object {
  var dataSourceName: java.lang.String
  var endpointId: java.lang.String
  var endpointUrl: java.lang.String
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var resultSelector: java.lang.String
  var resultTemplate: java.lang.String
  var target: java.lang.String
}

object DataSourceBindingBase {
  @scala.inline
  def apply(
    dataSourceName: java.lang.String,
    endpointId: java.lang.String,
    endpointUrl: java.lang.String,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    resultSelector: java.lang.String,
    resultTemplate: java.lang.String,
    target: java.lang.String
  ): DataSourceBindingBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSourceName")(dataSourceName)
    __obj.updateDynamic("endpointId")(endpointId)
    __obj.updateDynamic("endpointUrl")(endpointUrl)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("resultSelector")(resultSelector)
    __obj.updateDynamic("resultTemplate")(resultTemplate)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DataSourceBindingBase]
  }
}

