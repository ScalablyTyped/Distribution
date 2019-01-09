package typings
package wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/EntityObject", "EntityObject")
@js.native
abstract class EntityObject ()
  extends wonderDotJsLib.distEs2015CoreEntityMod.Entity {
  var bubbleParent: EntityObject = js.native
  var componentDirty: scala.Boolean = js.native
  var componentManager: wonderDotJsLib.distEs2015CoreEntityObjectManagerComponentManagerMod.ComponentManager = js.native
  var customEventMap: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<Collection<CustomEventRegisterData>> */ js.Any = js.native
  var name: java.lang.String = js.native
  var parent: EntityObject = js.native
  val transform: wonderDotJsLib.distEs2015ComponentTransformTransformMod.Transform = js.native
  def addChild(child: EntityObject): EntityObject = js.native
  def addComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): this.type = js.native
  def addComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component, isShareComponent: scala.Boolean): this.type = js.native
  /* protected */ def afterInitChildren(): scala.Unit = js.native
  def clearCache(): scala.Unit = js.native
  def clone(config: CloneEntityObjectConfigData): js.Any = js.native
  /* protected */ def createTransform(): wonderDotJsLib.distEs2015ComponentTransformTransformMod.Transform = js.native
  def dispose(): scala.Unit = js.native
  def forEach(func: js.Function2[/* entityObject */ this.type, /* index */ scala.Double, scala.Unit]): this.type = js.native
  def forEachComponent(
    func: js.Function1[/* component */ wonderDotJsLib.distEs2015CoreComponentMod.Component, scala.Unit]
  ): this.type = js.native
  def getChildren(): js.Any = js.native
  def getComponent[T](_class: js.Any): T = js.native
  def getGeometry(): wonderDotJsLib.distEs2015ComponentGeometryGeometryMod.Geometry = js.native
  /* protected */ def getRenderList(): js.Any = js.native
  def hasChild(child: EntityObject): scala.Boolean = js.native
  def hasComponent(_class: js.Function): scala.Boolean = js.native
  def hasComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): scala.Boolean = js.native
  def init(): this.type = js.native
  def initWhenCreate(): scala.Unit = js.native
  def removeChild(child: EntityObject): EntityObject = js.native
  def removeComponent(_class: js.Function): js.Any = js.native
  def removeComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): js.Any = js.native
  def render(
    renderer: wonderDotJsLib.distEs2015RendererRendererRendererMod.Renderer,
    camera: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
  ): scala.Unit = js.native
  def update(elapsed: scala.Double): scala.Unit = js.native
}

