package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ComponentManager")
@js.native
class ComponentManager protected ()
  extends typings.wonderJs.componentManagerMod.ComponentManager {
  def this(entityObject: typings.wonderJs.entityObjectMod.EntityObject) = this()
}
/* static members */
object ComponentManager {
  
  @JSImport("wonder.js/dist/es2015", "ComponentManager")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(entityObject: typings.wonderJs.entityObjectMod.EntityObject): typings.wonderJs.componentManagerMod.ComponentManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.componentManagerMod.ComponentManager]
}
