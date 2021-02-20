package typings.twilsock

import typings.node.eventsMod.EventEmitter
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @js.native
  trait Channel extends EventEmitter {
    
    var isConnected: Boolean = js.native
    
    def send(message: ArrayBuffer): Unit = js.native
  }
}
