package typings.uirouterCore

import typings.uirouterCore.libRouterMod.UIRouter
import typings.uirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaMemoryLocationServiceMod {
  
  @JSImport("@uirouter/core/lib/vanilla/memoryLocationService", "MemoryLocationService")
  @js.native
  open class MemoryLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
    
    var _url: String = js.native
  }
}
