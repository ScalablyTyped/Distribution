package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EntityObjectManager")
@js.native
open class EntityObjectManager protected ()
  extends typings.wonderJs.distEs2015CoreEntityObjectManagerEntityObjectManagerMod.EntityObjectManager {
  def this(entityObject: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject) = this()
}
/* static members */
object EntityObjectManager {
  
  @JSImport("wonder.js/dist/es2015", "EntityObjectManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(entityObject: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): typings.wonderJs.distEs2015CoreEntityObjectManagerEntityObjectManagerMod.EntityObjectManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.distEs2015CoreEntityObjectManagerEntityObjectManagerMod.EntityObjectManager]
}
