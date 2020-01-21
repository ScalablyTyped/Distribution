package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "EntityObjectManager")
@js.native
class EntityObjectManager protected ()
  extends typings.wonderJs.entityObjectManagerMod.EntityObjectManager {
  def this(entityObject: typings.wonderJs.entityObjectMod.EntityObject) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "EntityObjectManager")
@js.native
object EntityObjectManager extends js.Object {
  def create(entityObject: typings.wonderJs.entityObjectMod.EntityObject): typings.wonderJs.entityObjectManagerMod.EntityObjectManager = js.native
}

