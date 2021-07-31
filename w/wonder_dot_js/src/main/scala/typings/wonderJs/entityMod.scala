package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("wonder.js/dist/es2015/core/Entity", "Entity")
  @js.native
  abstract class Entity () extends StObject {
    
    def addTag(tag: String): Unit = js.native
    
    def containTag(tag: String): Boolean = js.native
    
    var data: js.Any = js.native
    
    def getTagList(): js.Any = js.native
    
    def hasTag(tag: String): Boolean = js.native
    
    def removeTag(tag: String): Unit = js.native
    
    var uid: Double = js.native
  }
}
