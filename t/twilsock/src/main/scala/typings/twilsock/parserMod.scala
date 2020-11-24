package typings.twilsock

import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import typings.twilsock.protocolMod.Protocol.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  
  @js.native
  class Parser () extends js.Object
  /* static members */
  @js.native
  object Parser extends js.Object {
    
    def createPacket(header: Header): ArrayBuffer = js.native
    def createPacket(header: Header, payloadString: String): ArrayBuffer = js.native
    
    def parse(message: ArrayBufferLike): js.Any = js.native
  }
}
