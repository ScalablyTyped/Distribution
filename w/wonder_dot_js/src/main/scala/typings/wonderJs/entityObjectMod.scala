package typings.wonderJs

import typings.wonderJs.componentManagerMod.ComponentManager
import typings.wonderJs.componentMod.Component
import typings.wonderJs.entityMod.Entity
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.rendererMod.Renderer
import typings.wonderJs.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityObjectMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/EntityObject", "EntityObject")
  @js.native
  abstract class EntityObject () extends Entity {
    
    def addChild(child: EntityObject): EntityObject = js.native
    
    def addComponent(component: Component): this.type = js.native
    def addComponent(component: Component, isShareComponent: Boolean): this.type = js.native
    
    /* protected */ def afterInitChildren(): Unit = js.native
    
    var bubbleParent: EntityObject = js.native
    
    def clearCache(): Unit = js.native
    
    def clone(config: CloneEntityObjectConfigData): Any = js.native
    
    var componentDirty: Boolean = js.native
    
    /* protected */ var componentManager: ComponentManager = js.native
    
    /* protected */ def createTransform(): Transform = js.native
    
    var customEventMap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<Collection<CustomEventRegisterData>> */ Any = js.native
    
    def dispose(): Unit = js.native
    
    def forEach(func: js.Function2[/* entityObject */ this.type, /* index */ Double, Unit]): this.type = js.native
    
    def forEachComponent(func: js.Function1[/* component */ Component, Unit]): this.type = js.native
    
    def getChildren(): Any = js.native
    
    def getComponent[T](_class: Any): T = js.native
    
    def getGeometry(): Geometry = js.native
    
    /* protected */ def getRenderList(): Any = js.native
    
    def hasChild(child: EntityObject): Boolean = js.native
    
    def hasComponent(_class: js.Function): Boolean = js.native
    def hasComponent(component: Component): Boolean = js.native
    
    def init(): this.type = js.native
    
    def initWhenCreate(): Unit = js.native
    
    var name: String = js.native
    
    var parent: EntityObject = js.native
    
    def removeChild(child: EntityObject): EntityObject = js.native
    
    def removeComponent(_class: js.Function): Any = js.native
    def removeComponent(component: Component): Any = js.native
    
    def render(renderer: Renderer, camera: GameObject): Unit = js.native
    
    val transform: Transform = js.native
    
    def update(elapsed: Double): Unit = js.native
  }
  
  trait CloneEntityObjectConfigData extends StObject {
    
    var cloneChildren: js.UndefOr[Boolean] = js.undefined
    
    var cloneGeometry: js.UndefOr[Boolean] = js.undefined
    
    var shareGeometry: js.UndefOr[Boolean] = js.undefined
  }
  object CloneEntityObjectConfigData {
    
    inline def apply(): CloneEntityObjectConfigData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneEntityObjectConfigData]
    }
    
    extension [Self <: CloneEntityObjectConfigData](x: Self) {
      
      inline def setCloneChildren(value: Boolean): Self = StObject.set(x, "cloneChildren", value.asInstanceOf[js.Any])
      
      inline def setCloneChildrenUndefined: Self = StObject.set(x, "cloneChildren", js.undefined)
      
      inline def setCloneGeometry(value: Boolean): Self = StObject.set(x, "cloneGeometry", value.asInstanceOf[js.Any])
      
      inline def setCloneGeometryUndefined: Self = StObject.set(x, "cloneGeometry", js.undefined)
      
      inline def setShareGeometry(value: Boolean): Self = StObject.set(x, "shareGeometry", value.asInstanceOf[js.Any])
      
      inline def setShareGeometryUndefined: Self = StObject.set(x, "shareGeometry", js.undefined)
    }
  }
}
