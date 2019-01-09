package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebSocketNs {
  /**
    * CertMeta represents the accepted types for certificate & key data.
    */
  type CertMeta = java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  /**
    * Data represents the message payload received over the WebSocket.
    */
  type Data = java.lang.String | nodeLib.Buffer | stdLib.ArrayBuffer | js.Array[nodeLib.Buffer]
  /**
    * VerifyClientCallbackAsync is an asynchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ wsLib.Anon_Origin, 
    /* callback */ js.Function4[
      /* res */ scala.Boolean, 
      /* code */ js.UndefOr[scala.Double], 
      /* message */ js.UndefOr[java.lang.String], 
      /* headers */ js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders], 
      scala.Unit
    ], 
    scala.Unit
  ]
  /**
    * VerifyClientCallbackSync is a synchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackSync = js.Function1[/* info */ wsLib.Anon_Origin, scala.Boolean]
}
