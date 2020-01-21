package typings.wonderJs.entityObjectMod

import typings.wonderJs.componentManagerMod.ComponentManager
import typings.wonderJs.componentMod.Component
import typings.wonderJs.entityMod.Entity
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.rendererMod.Renderer
import typings.wonderJs.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/EntityObject", "EntityObject")
@js.native
abstract class EntityObject () extends Entity {
  var bubbleParent: EntityObject = js.native
  var componentDirty: Boolean = js.native
  var componentManager: ComponentManager = js.native
  var customEventMap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<Collection<CustomEventRegisterData>> */ js.Any = js.native
  var name: String = js.native
  var parent: EntityObject = js.native
  val transform: Transform = js.native
  def addChild(child: EntityObject): EntityObject = js.native
  def addComponent(component: Component): this.type = js.native
  def addComponent(component: Component, isShareComponent: Boolean): this.type = js.native
  /* protected */ def afterInitChildren(): Unit = js.native
  def clearCache(): Unit = js.native
  def clone(config: CloneEntityObjectConfigData): js.Any = js.native
  /* protected */ def createTransform(): Transform = js.native
  def dispose(): Unit = js.native
  def forEach(func: js.Function2[/* entityObject */ this.type, /* index */ Double, Unit]): this.type = js.native
  def forEachComponent(func: js.Function1[/* component */ Component, Unit]): this.type = js.native
  def getChildren(): js.Any = js.native
  def getComponent[T](_class: js.Any): T = js.native
  def getGeometry(): Geometry = js.native
  /* protected */ def getRenderList(): js.Any = js.native
  def hasChild(child: EntityObject): Boolean = js.native
  def hasComponent(_class: js.Function): Boolean = js.native
  def hasComponent(component: Component): Boolean = js.native
  def init(): this.type = js.native
  def initWhenCreate(): Unit = js.native
  def removeChild(child: EntityObject): EntityObject = js.native
  def removeComponent(_class: js.Function): js.Any = js.native
  def removeComponent(component: Component): js.Any = js.native
  def render(renderer: Renderer, camera: GameObject): Unit = js.native
  def update(elapsed: Double): Unit = js.native
}

