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
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceBindingBase]
  }
}

