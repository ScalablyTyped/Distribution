package typings.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uwsMod {
  import typings.uws.Anon_Origin

  type VerifyClientCallbackAsync = js.Function2[/* info */ Anon_Origin, /* callback */ js.Function1[/* res */ Boolean, Unit], Unit]
  type VerifyClientCallbackSync = js.Function1[/* info */ Anon_Origin, Boolean]
}
