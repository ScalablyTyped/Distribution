package typings.wonderJs

import typings.wonderJs.entityMod.Entity
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("wonder.js/dist/es2015/core/Component", "Component")
  @js.native
  abstract class Component () extends Entity {
    
    def addToComponentContainer(): Unit = js.native
    
    def addToObject(entityObject: EntityObject): Unit = js.native
    def addToObject(entityObject: EntityObject, isShareComponent: Boolean): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var entityObject: EntityObject = js.native
    
    def init(): Unit = js.native
    
    def removeFromComponentContainer(): Unit = js.native
    
    def removeFromObject(entityObject: EntityObject): Unit = js.native
    
    val transform: Transform = js.native
  }
}
