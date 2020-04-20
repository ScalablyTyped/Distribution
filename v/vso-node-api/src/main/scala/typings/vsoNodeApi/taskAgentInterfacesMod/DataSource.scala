package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var endpointUrl: String
  var name: String
  var resultSelector: String
}

object DataSource {
  @scala.inline
  def apply(endpointUrl: String, name: String, resultSelector: String): DataSource = {
    val __obj = js.Dynamic.literal(endpointUrl = endpointUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

