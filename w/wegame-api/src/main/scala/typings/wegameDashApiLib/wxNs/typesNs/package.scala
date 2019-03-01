package typings
package wegameDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type SocketErrorCallback = js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]
  type SocketMessageCallback = js.Function1[/* res */ wegameDashApiLib.Anon_Data, scala.Unit]
  type SocketOpenCallback = js.Function1[/* res */ wegameDashApiLib.Anon_Header, scala.Unit]
}
