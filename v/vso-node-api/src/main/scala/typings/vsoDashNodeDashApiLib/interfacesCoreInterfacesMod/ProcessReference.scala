package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessReference extends js.Object {
  var name: java.lang.String
  var url: java.lang.String
}

object ProcessReference {
  @scala.inline
  def apply(name: java.lang.String, url: java.lang.String): ProcessReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ProcessReference]
  }
}

