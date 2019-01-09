package typings
package wonderDotJsLib.distEs2015CoreEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Entity", "Entity")
@js.native
abstract class Entity () extends js.Object {
  var data: js.Any = js.native
  var uid: scala.Double = js.native
  def addTag(tag: java.lang.String): scala.Unit = js.native
  def containTag(tag: java.lang.String): scala.Boolean = js.native
  def getTagList(): js.Any = js.native
  def hasTag(tag: java.lang.String): scala.Boolean = js.native
  def removeTag(tag: java.lang.String): scala.Unit = js.native
}

