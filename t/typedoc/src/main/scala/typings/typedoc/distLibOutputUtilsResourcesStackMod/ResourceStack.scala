package typings.typedoc.distLibOutputUtilsResourcesStackMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/stack", "ResourceStack")
@js.native
abstract class ResourceStack[T /* <: Resource */] protected () extends js.Object {
  def this(resourceClass: ResourceClass[T]) = this()
  def this(resourceClass: ResourceClass[T], resourceRegExp: RegExp) = this()
  var isActive: js.Any = js.native
  var origins: js.Any = js.native
  var resourceClass: js.Any = js.native
  var resourceRegExp: js.Any = js.native
  def activate(): Boolean = js.native
  def addOrigin(name: String, path: String): Unit = js.native
  def addOrigin(name: String, path: String, ignoreErrors: Boolean): Unit = js.native
  def deactivate(): Boolean = js.native
  def getAllResources(): ResourceMap[T] = js.native
  def getOrigin(name: String): js.UndefOr[ResourceOrigin[T]] = js.native
  def getResource(name: String): js.UndefOr[T] = js.native
  def getResourceClass(): ResourceClass[T] = js.native
  def getResourceRegExp(): RegExp = js.native
  def hasOrigin(name: String): Boolean = js.native
  def removeAllOrigins(): Unit = js.native
  def removeOrigin(name: String): Unit = js.native
}

