package typings.windowsMutex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-mutex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("windows-mutex", "Mutex")
  @js.native
  class Mutex protected () extends StObject {
    def this(name: String) = this()
    
    def isActive(): Boolean = js.native
    
    def release(): Unit = js.native
  }
  
  inline def isActive(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
