package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceDetails extends js.Object {
  var dataSourceName: String
  var dataSourceUrl: String
  var parameters: StringDictionary[String]
  var resultSelector: String
}

object DataSourceDetails {
  @scala.inline
  def apply(
    dataSourceName: String,
    dataSourceUrl: String,
    parameters: StringDictionary[String],
    resultSelector: String
  ): DataSourceDetails = {
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName, dataSourceUrl = dataSourceUrl, parameters = parameters, resultSelector = resultSelector)
  
    __obj.asInstanceOf[DataSourceDetails]
  }
}

