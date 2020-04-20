package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryModel extends js.Object {
  var query: String
}

object QueryModel {
  @scala.inline
  def apply(query: String): QueryModel = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryModel]
  }
}

