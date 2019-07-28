package typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceBindingBase extends js.Object {
  var dataSourceName: String
  var endpointId: String
  var endpointUrl: String
  var parameters: StringDictionary[String]
  var resultSelector: String
  var resultTemplate: String
  var target: String
}

object DataSourceBindingBase {
  @scala.inline
  def apply(
    dataSourceName: String,
    endpointId: String,
    endpointUrl: String,
    parameters: StringDictionary[String],
    resultSelector: String,
    resultTemplate: String,
    target: String
  ): DataSourceBindingBase = {
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName, endpointId = endpointId, endpointUrl = endpointUrl, parameters = parameters, resultSelector = resultSelector, resultTemplate = resultTemplate, target = target)
  
    __obj.asInstanceOf[DataSourceBindingBase]
  }
}

