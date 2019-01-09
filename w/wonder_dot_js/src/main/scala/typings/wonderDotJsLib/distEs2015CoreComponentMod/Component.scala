package typings
package wonderDotJsLib.distEs2015CoreComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Component", "Component")
@js.native
abstract class Component ()
  extends wonderDotJsLib.distEs2015CoreEntityMod.Entity {
  var entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject = js.native
  val transform: wonderDotJsLib.distEs2015ComponentTransformTransformMod.Transform = js.native
  def addToComponentContainer(): scala.Unit = js.native
  def addToObject(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Unit = js.native
  def addToObject(
    entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    isShareComponent: scala.Boolean
  ): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def removeFromComponentContainer(): scala.Unit = js.native
  def removeFromObject(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Unit = js.native
}

