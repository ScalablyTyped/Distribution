package typings
package typescriptDashServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DependencyList extends js.Object {
  var dependencyList: java.lang.String
  var importList: java.lang.String
}

object Anon_DependencyList {
  @scala.inline
  def apply(dependencyList: java.lang.String, importList: java.lang.String): Anon_DependencyList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dependencyList")(dependencyList)
    __obj.updateDynamic("importList")(importList)
    __obj.asInstanceOf[Anon_DependencyList]
  }
}

