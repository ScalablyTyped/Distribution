package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyBinding extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object DependencyBinding {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): DependencyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DependencyBinding]
  }
}

