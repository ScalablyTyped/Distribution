package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderDotJs.distEs2015ComponentRendererRendererComponentMod.RendererComponent
import typings.wonderDotJs.distEs2015ComponentTransformTransformMod.Transform
import typings.wonderDotJs.distEs2015CoreComponentMod.Component
import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", JSImport.Namespace)
@js.native
object distEs2015CoreEntityObjectManagerComponentManagerMod extends js.Object {
  @js.native
  class ComponentManager protected () extends js.Object {
    def this(entityObject: EntityObject) = this()
    var transform: Transform = js.native
    def addComponent(component: Component): this.type = js.native
    def addComponent(component: Component, isShareComponent: Boolean): this.type = js.native
    def dispose(): Unit = js.native
    def findComponentByUid(uid: Double): js.Any = js.native
    def forEachComponent(func: js.Function1[/* component */ Component, Unit]): this.type = js.native
    def getComponent[T](_class: js.Any): T = js.native
    def getComponentCount(_class: js.Function): Double = js.native
    def getComponents(): js.Any = js.native
    def getGeometry(): Geometry = js.native
    def getRendererComponent(): RendererComponent = js.native
    def hasComponent(_class: js.Function): Boolean = js.native
    def hasComponent(component: Component): Boolean = js.native
    def init(): Unit = js.native
    def removeAllComponent(): js.Any = js.native
    def removeComponent(_class: js.Function): js.Any = js.native
    def removeComponent(component: Component): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ComponentManager extends js.Object {
    def create(entityObject: EntityObject): ComponentManager = js.native
  }
  
}

