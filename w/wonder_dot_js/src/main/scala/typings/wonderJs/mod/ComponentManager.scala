package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ComponentManager")
@js.native
class ComponentManager protected ()
  extends typings.wonderJs.componentManagerMod.ComponentManager {
  def this(entityObject: typings.wonderJs.entityObjectMod.EntityObject) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "ComponentManager")
@js.native
object ComponentManager extends js.Object {
  def create(entityObject: typings.wonderJs.entityObjectMod.EntityObject): typings.wonderJs.componentManagerMod.ComponentManager = js.native
}

