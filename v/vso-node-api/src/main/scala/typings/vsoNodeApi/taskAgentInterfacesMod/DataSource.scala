package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  var endpointUrl: String = js.native
  var name: String = js.native
  var resultSelector: String = js.native
}

object DataSource {
  @scala.inline
  def apply(endpointUrl: String, name: String, resultSelector: String): DataSource = {
    val __obj = js.Dynamic.literal(endpointUrl = endpointUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
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
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultSelector(value: String): Self = this.set("resultSelector", value.asInstanceOf[js.Any])
  }
  
}

