package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceDetails extends js.Object {
  var dataSourceName: java.lang.String
  var dataSourceUrl: java.lang.String
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var resultSelector: java.lang.String
}

object DataSourceDetails {
  @scala.inline
  def apply(
    dataSourceName: java.lang.String,
    dataSourceUrl: java.lang.String,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    resultSelector: java.lang.String
  ): DataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSourceName")(dataSourceName)
    __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("resultSelector")(resultSelector)
    __obj.asInstanceOf[DataSourceDetails]
  }
}

