package typings
package wonderDotJsLib.distEs2015CoreEntityObjectManagerEntityObjectManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/manager/EntityObjectManager", "EntityObjectManager")
@js.native
class EntityObjectManager protected () extends js.Object {
  def this(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject) = this()
  def addChild(child: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): this.type = js.native
  def addChildren(
    children: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<EntityObject> */ js.Any
  ): js.Any = js.native
  def addChildren(children: js.Array[wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject]): js.Any = js.native
  def addChildren(children: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): js.Any = js.native
  def dispose(): scala.Unit = js.native
  def filter(
    func: js.Function1[
      /* entityObject */ wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, 
      scala.Boolean
    ]
  ): js.Any = js.native
  def findChildByName(name: java.lang.String): js.Any = js.native
  def findChildByTag(tag: java.lang.String): js.Any = js.native
  def findChildByUid(uid: scala.Double): js.Any = js.native
  def findChildrenByName(name: java.lang.String): js.Any = js.native
  def forEach(
    func: js.Function2[
      /* entityObject */ wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def getAllChildren(): js.Any = js.native
  def getChild(index: scala.Double): js.Any = js.native
  def getChildren(): js.Any = js.native
  def hasChild(child: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Boolean = js.native
  def init(): scala.Unit = js.native
  def removeAllChildren(): scala.Unit = js.native
  def removeChild(child: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): this.type = js.native
  def sort(
    func: js.Function2[
      /* a */ wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, 
      /* b */ wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, 
      _
    ]
  ): js.Any = js.native
  def sort(
    func: js.Function2[
      /* a */ wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, 
      /* b */ wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, 
      _
    ],
    isSortSelf: scala.Boolean
  ): js.Any = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/core/entityObject/manager/EntityObjectManager", "EntityObjectManager")
@js.native
object EntityObjectManager extends js.Object {
  def create(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): wonderDotJsLib.distEs2015CoreEntityObjectManagerEntityObjectManagerMod.EntityObjectManager = js.native
}

