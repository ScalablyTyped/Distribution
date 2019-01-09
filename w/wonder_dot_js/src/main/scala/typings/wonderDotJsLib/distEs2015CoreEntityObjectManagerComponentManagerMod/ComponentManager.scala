package typings
package wonderDotJsLib.distEs2015CoreEntityObjectManagerComponentManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", "ComponentManager")
@js.native
class ComponentManager protected () extends js.Object {
  def this(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject) = this()
  var transform: wonderDotJsLib.distEs2015ComponentTransformTransformMod.Transform = js.native
  def addComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): this.type = js.native
  def addComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component, isShareComponent: scala.Boolean): this.type = js.native
  def dispose(): scala.Unit = js.native
  def findComponentByUid(uid: scala.Double): js.Any = js.native
  def forEachComponent(
    func: js.Function1[/* component */ wonderDotJsLib.distEs2015CoreComponentMod.Component, scala.Unit]
  ): this.type = js.native
  def getComponent[T](_class: js.Any): T = js.native
  def getComponentCount(_class: js.Function): scala.Double = js.native
  def getComponents(): js.Any = js.native
  def getGeometry(): wonderDotJsLib.distEs2015ComponentGeometryGeometryMod.Geometry = js.native
  def getRendererComponent(): wonderDotJsLib.distEs2015ComponentRendererRendererComponentMod.RendererComponent = js.native
  def hasComponent(_class: js.Function): scala.Boolean = js.native
  def hasComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): scala.Boolean = js.native
  def init(): scala.Unit = js.native
  def removeAllComponent(): js.Any = js.native
  def removeComponent(_class: js.Function): js.Any = js.native
  def removeComponent(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): js.Any = js.native
}

@JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", "ComponentManager")
@js.native
object ComponentManager extends js.Object {
  def create(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): wonderDotJsLib.distEs2015CoreEntityObjectManagerComponentManagerMod.ComponentManager = js.native
}

