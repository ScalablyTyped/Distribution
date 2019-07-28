package typings.uws

import typings.uws.Anon_Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uwsMod {
  type VerifyClientCallbackAsync = js.Function2[/* info */ Anon_Origin, /* callback */ js.Function1[/* res */ Boolean, Unit], Unit]
  type VerifyClientCallbackSync = js.Function1[/* info */ Anon_Origin, Boolean]
}
