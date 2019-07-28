package typings.typedoc.distLibOutputUtilsResourcesStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/stack", "Resource")
@js.native
abstract class Resource protected () extends js.Object {
  def this(origin: ResourceOrigin[_], name: String, fileName: String) = this()
  var fileName: String = js.native
  var name: String = js.native
  var origin: ResourceOrigin[_] = js.native
  def getName(): String = js.native
}

