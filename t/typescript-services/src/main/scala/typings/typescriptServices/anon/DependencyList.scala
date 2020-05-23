package typings.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyList extends js.Object {
  var dependencyList: String
  var importList: String
}

object DependencyList {
  @scala.inline
  def apply(dependencyList: String, importList: String): DependencyList = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], importList = importList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyList]
  }
}

