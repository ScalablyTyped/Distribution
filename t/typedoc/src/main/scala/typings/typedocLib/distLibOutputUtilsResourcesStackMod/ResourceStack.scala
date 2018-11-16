package typings
package typedocLib.distLibOutputUtilsResourcesStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/stack", "ResourceStack")
@js.native
abstract class ResourceStack[T /* <: Resource */] protected () extends js.Object {
  def this(ressourceClass: ResourceClass[T]) = this()
  def this(ressourceClass: ResourceClass[T], ressourceRegExp: stdLib.RegExp) = this()
  var isActive: js.Any = js.native
  var origins: js.Any = js.native
  var ressourceClass: js.Any = js.native
  var ressourceRegExp: js.Any = js.native
  def activate(): scala.Boolean = js.native
  def addOrigin(name: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def addOrigin(name: java.lang.String, path: java.lang.String, ignoreErrors: scala.Boolean): scala.Unit = js.native
  def deactivate(): scala.Boolean = js.native
  def getAllResources(): ResourceMap[T] = js.native
  def getOrigin(name: java.lang.String): ResourceOrigin[T] = js.native
  def getResource(name: java.lang.String): T = js.native
  def getResourceClass(): ResourceClass[T] = js.native
  def getRessourceRegExp(): stdLib.RegExp = js.native
  def hasOrigin(name: java.lang.String): scala.Boolean = js.native
  def removeAllOrigins(): scala.Unit = js.native
  def removeOrigin(name: java.lang.String): scala.Unit = js.native
}

