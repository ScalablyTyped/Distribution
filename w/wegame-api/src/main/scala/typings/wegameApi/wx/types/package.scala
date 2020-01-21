package typings.wegameApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type SocketErrorCallback = js.Function1[/* res */ typings.wegameApi.AnonErrMsg, scala.Unit]
  type SocketMessageCallback = js.Function1[/* res */ typings.wegameApi.AnonDataArrayBuffer, scala.Unit]
  type SocketOpenCallback = js.Function1[/* res */ typings.wegameApi.AnonHeader, scala.Unit]
}
