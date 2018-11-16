package typings
package typedocLib.distLibOutputUtilsResourcesStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/stack", "ResourceOrigin")
@js.native
class ResourceOrigin[T /* <: Resource */] protected () extends js.Object {
  def this(stack: ResourceStack[T], name: java.lang.String, path: java.lang.String) = this()
  var findResources: js.Any = js.native
  var name: js.Any = js.native
  var path: js.Any = js.native
  var resources: js.Any = js.native
  var stack: js.Any = js.native
  def getName(): java.lang.String = js.native
  def getResource(name: java.lang.String): T = js.native
  def hasResource(name: java.lang.String): scala.Boolean = js.native
  def mergeResources(target: ResourceMap[T]): scala.Unit = js.native
}

