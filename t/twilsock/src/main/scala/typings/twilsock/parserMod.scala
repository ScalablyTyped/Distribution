package typings.twilsock

import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import typings.twilsock.protocolMod.Protocol.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("twilsock/lib/parser", "Parser")
  @js.native
  class Parser () extends StObject
  object Parser {
    
    @JSImport("twilsock/lib/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPacket(header: Header): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createPacket")(header.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    inline def createPacket(header: Header, payloadString: String): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPacket")(header.asInstanceOf[js.Any], payloadString.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    
    /* static member */
    inline def parse(message: ArrayBufferLike): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(message.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
