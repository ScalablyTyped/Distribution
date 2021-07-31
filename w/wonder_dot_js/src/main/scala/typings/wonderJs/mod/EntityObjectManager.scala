package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EntityObjectManager")
@js.native
class EntityObjectManager protected ()
  extends typings.wonderJs.entityObjectManagerMod.EntityObjectManager {
  def this(entityObject: typings.wonderJs.entityObjectMod.EntityObject) = this()
}
/* static members */
object EntityObjectManager {
  
  @JSImport("wonder.js/dist/es2015", "EntityObjectManager")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(entityObject: typings.wonderJs.entityObjectMod.EntityObject): typings.wonderJs.entityObjectManagerMod.EntityObjectManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.entityObjectManagerMod.EntityObjectManager]
}
