package typings.typedoc.distLibOutputUtilsResourcesStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/stack", "ResourceOrigin")
@js.native
class ResourceOrigin[T /* <: Resource */] protected () extends js.Object {
  def this(stack: ResourceStack[T], name: String, path: String) = this()
  var findResources: js.Any = js.native
  var name: js.Any = js.native
  var path: js.Any = js.native
  var resources: js.Any = js.native
  var stack: js.Any = js.native
  def getName(): String = js.native
  def getResource(name: String): js.UndefOr[T] = js.native
  def hasResource(name: String): Boolean = js.native
  def mergeResources(target: ResourceMap[T]): Unit = js.native
}

