package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(endpointUrl = endpointUrl, name = name, resultSelector = resultSelector)
  
    __obj.asInstanceOf[DataSource]
  }
}

