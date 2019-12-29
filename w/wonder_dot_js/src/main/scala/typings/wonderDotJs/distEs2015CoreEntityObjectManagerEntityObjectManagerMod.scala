package typings.wonderDotJs

import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/manager/EntityObjectManager", JSImport.Namespace)
@js.native
object distEs2015CoreEntityObjectManagerEntityObjectManagerMod extends js.Object {
  @js.native
  class EntityObjectManager protected () extends js.Object {
    def this(entityObject: EntityObject) = this()
    def addChild(child: EntityObject): this.type = js.native
    def addChildren(
      children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EntityObject> */ js.Any
    ): js.Any = js.native
    def addChildren(children: js.Array[EntityObject]): js.Any = js.native
    def addChildren(children: EntityObject): js.Any = js.native
    def dispose(): Unit = js.native
    def filter(func: js.Function1[/* entityObject */ EntityObject, Boolean]): js.Any = js.native
    def findChildByName(name: String): js.Any = js.native
    def findChildByTag(tag: String): js.Any = js.native
    def findChildByUid(uid: Double): js.Any = js.native
    def findChildrenByName(name: String): js.Any = js.native
    def forEach(func: js.Function2[/* entityObject */ EntityObject, /* index */ Double, Unit]): this.type = js.native
    def getAllChildren(): js.Any = js.native
    def getChild(index: Double): js.Any = js.native
    def getChildren(): js.Any = js.native
    def hasChild(child: EntityObject): Boolean = js.native
    def init(): Unit = js.native
    def removeAllChildren(): Unit = js.native
    def removeChild(child: EntityObject): this.type = js.native
    def sort(func: js.Function2[/* a */ EntityObject, /* b */ EntityObject, _]): js.Any = js.native
    def sort(func: js.Function2[/* a */ EntityObject, /* b */ EntityObject, _], isSortSelf: Boolean): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object EntityObjectManager extends js.Object {
    def create(entityObject: EntityObject): EntityObjectManager = js.native
  }
  
}

