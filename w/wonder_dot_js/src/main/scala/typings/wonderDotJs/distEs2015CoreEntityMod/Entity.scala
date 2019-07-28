package typings.wonderDotJs.distEs2015CoreEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Entity", "Entity")
@js.native
abstract class Entity () extends js.Object {
  var data: js.Any = js.native
  var uid: Double = js.native
  def addTag(tag: String): Unit = js.native
  def containTag(tag: String): Boolean = js.native
  def getTagList(): js.Any = js.native
  def hasTag(tag: String): Boolean = js.native
  def removeTag(tag: String): Unit = js.native
}

