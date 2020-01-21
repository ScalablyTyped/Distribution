package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], dataSourceUrl = dataSourceUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceDetails]
  }
}

