package typings.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPECIAL_HEADERS {
  
  @JSImport("undici/lib/llhttp/constants", "SPECIAL_HEADERS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("undici/lib/llhttp/constants", "SPECIAL_HEADERS.connection")
  @js.native
  def connection: HEADER_STATE = js.native
  inline def connection_=(x: HEADER_STATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connection")(x.asInstanceOf[js.Any])
  
  @JSImport("undici/lib/llhttp/constants", "SPECIAL_HEADERS.content-length")
  @js.native
  def contentLength: HEADER_STATE = js.native
  
  inline def contentLength_=(x: HEADER_STATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content-length")(x.asInstanceOf[js.Any])
  
  @JSImport("undici/lib/llhttp/constants", "SPECIAL_HEADERS.proxy-connection")
  @js.native
  def proxyConnection: HEADER_STATE = js.native
  
  inline def proxyConnection_=(x: HEADER_STATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("proxy-connection")(x.asInstanceOf[js.Any])
  
  @JSImport("undici/lib/llhttp/constants", "SPECIAL_HEADERS.transfer-encoding")
  @js.native
  def transferEncoding: HEADER_STATE = js.native
  
  inline def transferEncoding_=(x: HEADER_STATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transfer-encoding")(x.asInstanceOf[js.Any])
  
  @JSImport("undici/lib/llhttp/constants", "SPECIAL_HEADERS.upgrade")
  @js.native
  def upgrade: HEADER_STATE = js.native
  inline def upgrade_=(x: HEADER_STATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(x.asInstanceOf[js.Any])
}
