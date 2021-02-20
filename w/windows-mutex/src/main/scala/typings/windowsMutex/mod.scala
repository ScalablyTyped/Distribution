package typings.windowsMutex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-mutex", "Mutex")
  @js.native
  class Mutex protected () extends StObject {
    def this(name: String) = this()
    
    def isActive(): Boolean = js.native
    
    def release(): Unit = js.native
  }
  
  @JSImport("windows-mutex", "isActive")
  @js.native
  def isActive(name: String): Boolean = js.native
}
