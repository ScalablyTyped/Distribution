package typings
package typedocLib.distLibOutputUtilsResourcesStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/stack", "Resource")
@js.native
abstract class Resource protected () extends js.Object {
  def this(origin: ResourceOrigin[_], name: java.lang.String, fileName: java.lang.String) = this()
  var fileName: java.lang.String = js.native
  var name: java.lang.String = js.native
  var origin: ResourceOrigin[_] = js.native
  def getName(): java.lang.String = js.native
}

