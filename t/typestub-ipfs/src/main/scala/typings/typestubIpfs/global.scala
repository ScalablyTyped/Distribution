package typings.typestubIpfs

import typings.typestubIpfs.mod.IPFS
import typings.typestubIpfs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ipfs {
    
    @JSGlobal("ipfs")
    @js.native
    class ^ ()
      extends typings.typestubIpfs.mod.^ {
      def this(options: Options) = this()
    }
    
    @JSGlobal("ipfs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createNode(options: Options): IPFS = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(options.asInstanceOf[js.Any]).asInstanceOf[IPFS]
  }
}
