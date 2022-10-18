package typings.wonderJs

import typings.wonderJs.distEs2015ComponentTransformTransformMod.Transform
import typings.wonderJs.distEs2015CoreEntityMod.Entity
import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreComponentMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/core/Component", "Component")
  @js.native
  open class Component () extends Entity {
    
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
