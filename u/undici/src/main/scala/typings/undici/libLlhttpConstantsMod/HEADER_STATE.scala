package typings.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HEADER_STATE extends StObject
@JSImport("undici/lib/llhttp/constants", "HEADER_STATE")
@js.native
object HEADER_STATE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HEADER_STATE & Double] = js.native
  
  @js.native
  sealed trait CONNECTION
    extends StObject
       with HEADER_STATE
  /* 1 */ val CONNECTION: typings.undici.libLlhttpConstantsMod.HEADER_STATE.CONNECTION & Double = js.native
  
  @js.native
  sealed trait CONNECTION_CLOSE
    extends StObject
       with HEADER_STATE
  /* 6 */ val CONNECTION_CLOSE: typings.undici.libLlhttpConstantsMod.HEADER_STATE.CONNECTION_CLOSE & Double = js.native
  
  @js.native
  sealed trait CONNECTION_KEEP_ALIVE
    extends StObject
       with HEADER_STATE
  /* 5 */ val CONNECTION_KEEP_ALIVE: typings.undici.libLlhttpConstantsMod.HEADER_STATE.CONNECTION_KEEP_ALIVE & Double = js.native
  
  @js.native
  sealed trait CONNECTION_UPGRADE
    extends StObject
       with HEADER_STATE
  /* 7 */ val CONNECTION_UPGRADE: typings.undici.libLlhttpConstantsMod.HEADER_STATE.CONNECTION_UPGRADE & Double = js.native
  
  @js.native
  sealed trait CONTENT_LENGTH
    extends StObject
       with HEADER_STATE
  /* 2 */ val CONTENT_LENGTH: typings.undici.libLlhttpConstantsMod.HEADER_STATE.CONTENT_LENGTH & Double = js.native
  
  @js.native
  sealed trait GENERAL
    extends StObject
       with HEADER_STATE
  /* 0 */ val GENERAL: typings.undici.libLlhttpConstantsMod.HEADER_STATE.GENERAL & Double = js.native
  
  @js.native
  sealed trait TRANSFER_ENCODING
    extends StObject
       with HEADER_STATE
  /* 3 */ val TRANSFER_ENCODING: typings.undici.libLlhttpConstantsMod.HEADER_STATE.TRANSFER_ENCODING & Double = js.native
  
  @js.native
  sealed trait TRANSFER_ENCODING_CHUNKED
    extends StObject
       with HEADER_STATE
  /* 8 */ val TRANSFER_ENCODING_CHUNKED: typings.undici.libLlhttpConstantsMod.HEADER_STATE.TRANSFER_ENCODING_CHUNKED & Double = js.native
  
  @js.native
  sealed trait UPGRADE
    extends StObject
       with HEADER_STATE
  /* 4 */ val UPGRADE: typings.undici.libLlhttpConstantsMod.HEADER_STATE.UPGRADE & Double = js.native
}
