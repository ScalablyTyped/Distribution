package typings.wonderJs

import typings.wonderJs.componentMod.Component
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.rendererComponentMod.RendererComponent
import typings.wonderJs.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentManagerMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", "ComponentManager")
  @js.native
  class ComponentManager protected () extends StObject {
    def this(entityObject: EntityObject) = this()
    
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
    
    var transform: Transform = js.native
  }
  /* static members */
  object ComponentManager {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", "ComponentManager")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(entityObject: EntityObject): ComponentManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[ComponentManager]
  }
}
