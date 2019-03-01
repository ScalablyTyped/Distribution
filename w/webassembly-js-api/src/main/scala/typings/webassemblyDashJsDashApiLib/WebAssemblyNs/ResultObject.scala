package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject extends js.Object {
  var instance: Instance
  var module: Module
}

object ResultObject {
  @scala.inline
  def apply(instance: Instance, module: Module): ResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[ResultObject]
  }
}

