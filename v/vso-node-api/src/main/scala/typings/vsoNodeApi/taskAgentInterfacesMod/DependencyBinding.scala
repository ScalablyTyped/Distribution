package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyBinding extends js.Object {
  var key: String
  var value: String
}

object DependencyBinding {
  @scala.inline
  def apply(key: String, value: String): DependencyBinding = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyBinding]
  }
}

