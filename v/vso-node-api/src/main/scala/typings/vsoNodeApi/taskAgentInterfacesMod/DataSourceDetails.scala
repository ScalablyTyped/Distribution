package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceDetails extends js.Object {
  var dataSourceName: String = js.native
  var dataSourceUrl: String = js.native
  var parameters: StringDictionary[String] = js.native
  var resultSelector: String = js.native
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
  @scala.inline
  implicit class DataSourceDetailsOps[Self <: DataSourceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourceName(value: String): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultSelector(value: String): Self = this.set("resultSelector", value.asInstanceOf[js.Any])
  }
  
}

