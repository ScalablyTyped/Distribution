package typings.wegameApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type SocketErrorCallback = js.Function1[/* res */ typings.wegameApi.AnonErrMsg, scala.Unit]
  type SocketMessageCallback = js.Function1[/* res */ typings.wegameApi.Anon0, scala.Unit]
  type SocketOpenCallback = js.Function1[/* res */ typings.wegameApi.Anon1, scala.Unit]
}
