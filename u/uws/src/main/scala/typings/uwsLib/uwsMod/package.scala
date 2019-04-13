package typings
package uwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uwsMod {
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ uwsLib.Anon_Origin, 
    /* callback */ js.Function1[/* res */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type VerifyClientCallbackSync = js.Function1[/* info */ uwsLib.Anon_Origin, scala.Boolean]
}
