package typings.ws

import typings.node.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.ArrayBuffer
import typings.ws.Anon_Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsMod {
  /**
    * CertMeta represents the accepted types for certificate & key data.
    */
  type CertMeta = String | (js.Array[Buffer | String]) | Buffer
  /**
    * Data represents the message payload received over the WebSocket.
    */
  type Data = String | Buffer | ArrayBuffer | js.Array[Buffer]
  /**
    * VerifyClientCallbackAsync is an asynchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ Anon_Origin, 
    /* callback */ js.Function4[
      /* res */ Boolean, 
      /* code */ js.UndefOr[Double], 
      /* message */ js.UndefOr[String], 
      /* headers */ js.UndefOr[OutgoingHttpHeaders], 
      Unit
    ], 
    Unit
  ]
  /**
    * VerifyClientCallbackSync is a synchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackSync = js.Function1[/* info */ Anon_Origin, Boolean]
}
