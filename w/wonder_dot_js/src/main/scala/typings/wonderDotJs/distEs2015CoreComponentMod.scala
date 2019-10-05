package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentTransformTransformMod.Transform
import typings.wonderDotJs.distEs2015CoreEntityMod.Entity
import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Component", JSImport.Namespace)
@js.native
object distEs2015CoreComponentMod extends js.Object {
  @js.native
  abstract class Component () extends Entity {
    var entityObject: EntityObject = js.native
    val transform: Transform = js.native
    def addToComponentContainer(): Unit = js.native
    def addToObject(entityObject: EntityObject): Unit = js.native
    def addToObject(entityObject: EntityObject, isShareComponent: Boolean): Unit = js.native
    def dispose(): Unit = js.native
    def init(): Unit = js.native
    def removeFromComponentContainer(): Unit = js.native
    def removeFromObject(entityObject: EntityObject): Unit = js.native
  }
  
}

