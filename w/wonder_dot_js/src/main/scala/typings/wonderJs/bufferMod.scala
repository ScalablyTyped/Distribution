package typings.wonderJs

import typings.wonderJs.entityMod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/buffer/Buffer", "Buffer")
  @js.native
  abstract class Buffer () extends Entity {
    
    var buffer: Any = js.native
    
    def dispose(): Unit = js.native
    
    def resetData(data: Any, args: Any*): Unit = js.native
  }
}
