package typings.wol

import typings.node.bufferMod.global.Buffer
import typings.wol.mod.WakeCallback
import typings.wol.mod.WakeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wol {
    
    @JSGlobal("wol")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMagicPacket(mac: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createMagicPacket")(mac.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def wake(mac: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def wake(mac: String, callback: WakeCallback): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def wake(mac: String, options: Unit, callback: WakeCallback): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def wake(mac: String, options: WakeOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def wake(mac: String, options: WakeOptions, callback: WakeCallback): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  }
}
