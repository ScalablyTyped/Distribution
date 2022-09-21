package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityObjectManagerMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/manager/EntityObjectManager", "EntityObjectManager")
  @js.native
  open class EntityObjectManager protected () extends StObject {
    def this(entityObject: EntityObject) = this()
    
    def addChild(child: EntityObject): this.type = js.native
    
    def addChildren(children: js.Array[EntityObject]): Any = js.native
    def addChildren(
      children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EntityObject> */ Any
    ): Any = js.native
    def addChildren(children: EntityObject): Any = js.native
    
    def dispose(): Unit = js.native
    
    def filter(func: js.Function1[/* entityObject */ EntityObject, Boolean]): Any = js.native
    
    def findChildByName(name: String): Any = js.native
    
    def findChildByTag(tag: String): Any = js.native
    
    def findChildByUid(uid: Double): Any = js.native
    
    def findChildrenByName(name: String): Any = js.native
    
    def forEach(func: js.Function2[/* entityObject */ EntityObject, /* index */ Double, Unit]): this.type = js.native
    
    def getAllChildren(): Any = js.native
    
    def getChild(index: Double): Any = js.native
    
    def getChildren(): Any = js.native
    
    def hasChild(child: EntityObject): Boolean = js.native
    
    def init(): Unit = js.native
    
    def removeAllChildren(): Unit = js.native
    
    def removeChild(child: EntityObject): this.type = js.native
    
    def sort(func: js.Function2[/* a */ EntityObject, /* b */ EntityObject, Any]): Any = js.native
    def sort(func: js.Function2[/* a */ EntityObject, /* b */ EntityObject, Any], isSortSelf: Boolean): Any = js.native
  }
  /* static members */
  object EntityObjectManager {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/manager/EntityObjectManager", "EntityObjectManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(entityObject: EntityObject): EntityObjectManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[EntityObjectManager]
  }
}
