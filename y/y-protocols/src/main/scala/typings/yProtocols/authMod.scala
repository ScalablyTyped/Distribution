package typings.yProtocols

import typings.lib0.decodingMod.Decoder
import typings.lib0.encodingMod.Encoder
import typings.yProtocols.yProtocolsInts.`0`
import typings.yjs.mod.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("y-protocols/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("y-protocols/auth", "messagePermissionDenied")
  @js.native
  val messagePermissionDenied: `0` = js.native
  
  inline def readAuthMessage(decoder: Decoder, y: Doc, permissionDeniedHandler: PermissionDeniedHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readAuthMessage")(decoder.asInstanceOf[js.Any], y.asInstanceOf[js.Any], permissionDeniedHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writePermissionDenied(encoder: Encoder, reason: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePermissionDenied")(encoder.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type PermissionDeniedHandler = js.Function2[/* y */ Any, /* reason */ String, Any]
}
