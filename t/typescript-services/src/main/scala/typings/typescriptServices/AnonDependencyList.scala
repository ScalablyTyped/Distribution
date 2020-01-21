package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDependencyList extends js.Object {
  var dependencyList: String
  var importList: String
}

object AnonDependencyList {
  @scala.inline
  def apply(dependencyList: String, importList: String): AnonDependencyList = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], importList = importList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDependencyList]
  }
}

