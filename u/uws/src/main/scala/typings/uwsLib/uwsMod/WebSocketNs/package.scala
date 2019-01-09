package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebSocketNs {
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ uwsLib.Anon_Origin, 
    /* callback */ js.Function1[/* res */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type VerifyClientCallbackSync = js.Function1[/* info */ uwsLib.Anon_Origin, scala.Boolean]
}
