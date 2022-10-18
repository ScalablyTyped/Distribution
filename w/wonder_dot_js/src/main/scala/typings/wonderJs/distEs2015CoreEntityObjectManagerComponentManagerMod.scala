package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderJs.distEs2015ComponentRendererRendererComponentMod.RendererComponent
import typings.wonderJs.distEs2015ComponentTransformTransformMod.Transform
import typings.wonderJs.distEs2015CoreComponentMod.Component
import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreEntityObjectManagerComponentManagerMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", "ComponentManager")
  @js.native
  open class ComponentManager protected () extends StObject {
    def this(entityObject: EntityObject) = this()
    
    def addComponent(component: Component): this.type = js.native
    def addComponent(component: Component, isShareComponent: Boolean): this.type = js.native
    
    def dispose(): Unit = js.native
    
    def findComponentByUid(uid: Double): Any = js.native
    
    def forEachComponent(func: js.Function1[/* component */ Component, Unit]): this.type = js.native
    
    def getComponent[T](_class: Any): T = js.native
    
    def getComponentCount(_class: js.Function): Double = js.native
    
    def getComponents(): Any = js.native
    
    def getGeometry(): Geometry = js.native
    
    def getRendererComponent(): RendererComponent = js.native
    
    def hasComponent(_class: js.Function): Boolean = js.native
    def hasComponent(component: Component): Boolean = js.native
    
    def init(): Unit = js.native
    
    def removeAllComponent(): Any = js.native
    
    def removeComponent(_class: js.Function): Any = js.native
    def removeComponent(component: Component): Any = js.native
    
    var transform: Transform = js.native
  }
  /* static members */
  object ComponentManager {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/manager/ComponentManager", "ComponentManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(entityObject: EntityObject): ComponentManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[ComponentManager]
  }
}
