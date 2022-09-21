package typings.webpackVirtualModules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualStatsMod {
  
  @JSImport("webpack-virtual-modules/lib/virtual-stats", "VirtualStats")
  @js.native
  open class VirtualStats protected () extends StObject {
    def this(config: Any) = this()
    
    /* private */ var _checkModeProperty: Any = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
  }
}
